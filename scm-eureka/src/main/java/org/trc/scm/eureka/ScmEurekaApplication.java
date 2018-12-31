package org.trc.scm.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ScmEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScmEurekaApplication.class, args);
	}
}
