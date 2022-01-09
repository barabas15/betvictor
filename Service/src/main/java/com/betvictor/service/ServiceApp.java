package com.betvictor.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.betvictor.service")
public class ServiceApp {
  public static void main(String... args) {
    SpringApplication.run(ServiceApp.class, args);
  }
}
