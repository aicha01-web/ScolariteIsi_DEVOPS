package com.groupeisi.scolariteisi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.groupeisi.controller"})
public class ScolariteisiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScolariteisiApplication.class, args);
	}

}
