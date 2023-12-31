package com.sergioarboleda.costumes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})  //excluir el login al ingresar al proyecto desde la web
public class CostumesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CostumesApplication.class, args);
	}
}
