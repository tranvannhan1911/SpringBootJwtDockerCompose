package ongiuaky.ongiuaky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OngiuakyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OngiuakyApplication.class, args);
	}

}
