package com.example.evpedia;

import com.example.evpedia.client.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EvPediaApplication {

	public static void main(String[] args) {
//		Client client = new Client();
//		client.get("https://pokeapi.co/api/v2/region/johto");
		SpringApplication.run(EvPediaApplication.class, args);

	}

}
