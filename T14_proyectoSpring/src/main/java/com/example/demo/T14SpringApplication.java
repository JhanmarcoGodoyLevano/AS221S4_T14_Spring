package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import DemoService.IPersonaService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo", "DemoRepository", "DemoService"})
public class T14SpringApplication implements CommandLineRunner {

    private static Logger LOG = LoggerFactory.getLogger(T14SpringApplication.class);
    
    @Autowired
    private IPersonaService service;
    
    public static void main(String[] args) {
        SpringApplication.run(T14SpringApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        service.registrar("Inyeccion de Dependencias");
    }
}
