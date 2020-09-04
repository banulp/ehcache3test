package com.banulp.toy.ehcache3test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Ehcache3testApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ehcache3testApplication.class, args);
	}

}
