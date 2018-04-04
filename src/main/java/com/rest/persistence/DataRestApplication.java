/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rest.persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author SBOOT060318
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.rest")
public class DataRestApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DataRestApplication.class);
        application.run();
    }
}
