package org.tahsan.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootOpenshiftExampleApplication {
	
	@GetMapping("/")
	public String welcome() {
		
		return "Welcome to Spring Boot running on openshift!";
	}
	
	@GetMapping("/{input}")
	public String congrat(@PathVariable String input) {
		return "Congratulations " + input + "! you have successfully deployed your app on Openshift";
	}
			

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOpenshiftExampleApplication.class, args);
	}

}
