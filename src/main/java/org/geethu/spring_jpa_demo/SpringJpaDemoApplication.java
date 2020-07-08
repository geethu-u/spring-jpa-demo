package org.geethu.spring_jpa_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaDemoApplication {
// For running in terminal use mvn clean install or mvnw clean install , then run the jar by java -jar <outputjar>.jar, RUnd command does this internally
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}

}
