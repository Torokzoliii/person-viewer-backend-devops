package org.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.containers.MySQLContainer;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;

import java.time.Duration;

@SpringBootTest
public class IntegrationTest {
    static MySQLContainer<?> mysql = new MySQLContainer<>("mysql:8.0")
            .withDatabaseName("persondb")
            .withUsername("test")
            .withPassword("test")
            .withReuse(true)
            .withStartupTimeout(Duration.ofSeconds(30));

    static {
        mysql.start();
    }

    @DynamicPropertySource
    static void props(DynamicPropertyRegistry r) {
        r.add("spring.datasource.url", mysql::getJdbcUrl);
        r.add("spring.datasource.username", mysql::getUsername);
        r.add("spring.datasource.password", mysql::getPassword);
    }

    @Test
    void contextLoads() {
        System.out.println("Testcontainers MySQL is running on: " + mysql.getJdbcUrl());
    }
}