package com.example.profiles;

import com.example.profiles.model.PetRepository;
import com.example.profiles.model.PetType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@SpringBootApplication
public class ProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfilesApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(final PetRepository petRepository) throws Exception {
		return args -> {
			List<PetType> petTypes = petRepository.findPetTypes();
			System.out.println(petTypes);
			System.out.println(petRepository.count());
		};
	}
}
