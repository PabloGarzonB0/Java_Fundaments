package com.desarrolloIT.libreriaProject;

import com.desarrolloIT.libreriaProject.principal.principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class LibreriaProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		principal mainClass = new principal();
		mainClass.muestraElMenu();

			}
		}


