package com.wallet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan
@EnableJpaRepositories
@SpringBootApplication
public class WalletApplication {

<<<<<<< HEAD
	public static void main(String[] args) {
		SpringApplication.run(WalletApplication.class, args);
		
	}
=======
    public static void main(String[] args) {
        SpringApplication.run(WalletApplication.class, args);
    }
>>>>>>> 104fa58097c0c4078fb608c83ef58f6256fc57f9

}
