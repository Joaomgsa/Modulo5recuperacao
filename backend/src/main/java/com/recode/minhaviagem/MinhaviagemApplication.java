package com.recode.minhaviagem;


import java.util.stream.LongStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class MinhaviagemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinhaviagemApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(BookRepository repository) {
		return args -> {
			repository.deleteAll();
			LongStream.range(1, 11)
						.mapToObj(i -> {
							Book b = new Book();
							b.setTitle("Destino " + i);
							b.setPrice(199);
							b.setImageSrc("teste.png");
							return b;
						})
						.map(v -> repository.save(v))
						.forEach(System.out::println);
		};
	}
	
}

	


