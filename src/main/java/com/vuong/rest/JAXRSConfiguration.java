package com.vuong.rest;

import io.swagger.annotations.*;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.models.auth.*;
import io.swagger.models.auth.ApiKeyAuthDefinition;
import org.apache.log4j.Logger;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@ApplicationPath("api")
@SwaggerDefinition(
        info = 	@Info(
                title = "Sample JaxRs APIs",
                description = "This swagger is a simple representation for all jax_rs_sample RESTful APIs",
                version = "SwaggerDefinition version",
                termsOfService = "private",
                contact = @Contact(
                        name ="Vuong Nguyen",
                        email = "vuong.nguyen@axonactive.vn")),
        consumes = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML },
        produces = { MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML },
        tags = { @Tag(name = "private", description = "Tag used to denote operations as private") },
        schemes = {
                SwaggerDefinition.Scheme.HTTP,
                SwaggerDefinition.Scheme.HTTPS })
public class JAXRSConfiguration extends Application {

    private static final Logger LOGGER = Logger.getLogger(JAXRSConfiguration.class);

    public JAXRSConfiguration() {
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion(getVersion("com.vuong", "jax_rs_sample"));
        beanConfig.setSchemes(new String[] { "http" });
        beanConfig.setBasePath("jax_rs_sample/api");
        beanConfig.setResourcePackage("com.vuong.rest");
        beanConfig.setScan(true);
    }

    private String getVersion(String groupId, String artifactId) {
        Properties properties = getPropertiesInfo(groupId, artifactId);
        String version = properties.getProperty("version");

        if (version == null) {
            Package aPackage = getClass().getPackage();
            if (aPackage != null) {
                version = aPackage.getImplementationVersion();
                if (version == null) {
                    version = aPackage.getSpecificationVersion();
                }
            }
        }
        return version;
    }

    private Properties getPropertiesInfo(String groupId, String artifactId) {
        Properties property = new Properties();
        InputStream pomFile = getClass().getResourceAsStream("/META-INF/maven/" + groupId + "/" + artifactId + "/pom.properties");
        if (pomFile != null) {
            try {
                property.load(pomFile);
            } catch (IOException ex) {
                LOGGER.error("Cannot get the version of project from pom.properties", ex);
            }
        }
        return property;
    }
}