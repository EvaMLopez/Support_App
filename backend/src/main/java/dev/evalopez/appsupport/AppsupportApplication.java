package dev.evalopez.appsupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:5173") 
@SpringBootApplication
@ComponentScan("dev.evalopez.appsupport")
public class AppsupportApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppsupportApplication.class, args);
	}

}
