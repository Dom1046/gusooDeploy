package com.study.deploy.gusoodeploy

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class GusoodeployApplication {

	static void main(String[] args) {
		SpringApplication.run(GusoodeployApplication, args)
	}

}
