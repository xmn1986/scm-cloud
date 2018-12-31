package org.trc.scm.purchase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@tk.mybatis.spring.annotation.MapperScan(basePackages = "org.trc.scm.purchase.dao")
public class ScmPurchaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScmPurchaseApplication.class, args);
	}

}

