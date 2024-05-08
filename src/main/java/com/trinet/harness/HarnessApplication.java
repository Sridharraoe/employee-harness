package com.trinet.harness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class HarnessApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarnessApplication.class, args);
 	}

	 
}
