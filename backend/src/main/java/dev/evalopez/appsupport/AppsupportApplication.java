package dev.evalopez.appsupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("dev.evalopez.appsupport")
public class AppsupportApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppsupportApplication.class, args);
	}

}
