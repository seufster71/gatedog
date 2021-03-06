package org.pidragon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.pidragon","org.toasthub"})
public class GatedogApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatedogApplication.class, args);
	}
}
