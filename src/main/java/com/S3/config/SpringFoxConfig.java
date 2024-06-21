package com.S3.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;


@OpenAPIDefinition(info =
    @Info(title = "S3 API",
        version = "1.0",
        description = "Documentation for S3 API",
        contact = @Contact(
            name = "S3 API Support",
            email = "sachinnarvariya209@gmail.com"),
        license = @License(name = "Apache 2.0", url = "http://www.apache.org/licenses/LICENSE-2.0.html"),
        termsOfService = "http://swagger.io/terms/"

    )
)
public class SpringFoxConfig {

}
