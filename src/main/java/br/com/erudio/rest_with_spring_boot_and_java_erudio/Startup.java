package br.com.erudio.rest_with_spring_boot_and_java_erudio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// começa a aplicacao a partir daqui e procura componentes nas pastas abaixo desse package
@SpringBootApplication
public class Startup {

	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}

}
