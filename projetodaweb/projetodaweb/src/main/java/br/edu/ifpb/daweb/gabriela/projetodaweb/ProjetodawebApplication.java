package br.edu.ifpb.daweb.gabriela.projetodaweb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetodawebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjetodawebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Word!");
		
	}

}
