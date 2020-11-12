package springbootCRUD.registrationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//
//@ComponentScan(basePackages={"controller"})
//@EntityScan({"model"})
//@EnableJpaRepositories({"dao"})

@SpringBootApplication
public class RegistrationServiceApplication {

	public static void main(String[] args) {
		System.out.println("Project Works!!!!!!!!!!");
		SpringApplication.run(RegistrationServiceApplication.class, args);
	}

}
