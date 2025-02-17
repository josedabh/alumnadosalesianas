package com.alumnado.salesianas.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Salesianas API")
                        .description("API para gestionar al alumnado de Salesianas")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("José Daniel Bravo Heredia"))
                )
                .externalDocs(new ExternalDocumentation()
                        .description("Documentación completa")
                        .url("https://localhost:8080/index.html"))
                .servers(List.of(
                        new Server().url("http://localhost:8080")
                        .description("Servidor Local")));
    }
}