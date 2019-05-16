package com.lambda.zoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class ZooApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(ZooApplication.class, args);
    }

}
