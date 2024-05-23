package co.develhope.userUnitTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.modelmapper.ModelMapper;

@SpringBootApplication
public class UserUnitTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserUnitTestApplication.class, args);
	}
	@Bean
	public ModelMapper createModelMapper() {
		return new ModelMapper();
	}

}


