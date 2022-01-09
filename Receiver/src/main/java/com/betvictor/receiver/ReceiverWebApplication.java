package com.betvictor.receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.betvictor.service", "com.betvictor.receiver"})
public class ReceiverWebApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(ReceiverWebApplication.class, args);
  }
}
