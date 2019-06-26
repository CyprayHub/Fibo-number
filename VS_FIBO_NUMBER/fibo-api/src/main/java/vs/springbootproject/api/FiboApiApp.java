package vs.springbootproject.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class FiboApiApp {

	public static void main(String[] args) {
		SpringApplication.run(FiboApiApp.class, args);

	}

}
