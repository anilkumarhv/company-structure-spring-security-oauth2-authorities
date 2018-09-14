package com.adamzareba.spring.security.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = JmxAutoConfiguration.class)
@ComponentScan({"com.adamzareba.spring.security.oauth2"})
@EntityScan("com.adamzareba.spring.security.oauth2.model")
@EnableJpaRepositories("com.adamzareba.spring.security.oauth2.repository")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
