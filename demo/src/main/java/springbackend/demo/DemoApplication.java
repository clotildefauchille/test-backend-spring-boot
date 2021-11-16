package springbackend.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springbackend.demo.model.User;
import springbackend.demo.repository.UserRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
// Spring Boot fournit une interface nommée “CommandLineRunner”. En implémentant cette interface, la classe sera obligée de déclarer la méthode “public void run(String... args) throws Exception“. À partir de là, si la classe est un bean(bean, une classe au sein du contexte Spring) (c’est-à-dire chargée dans le contexte Spring), Spring Boot exécutera la méthode run à l’exécution du programme.
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("clotilde", "fauchille", "clotildefauchille@gmail.com"));
		this.userRepository.save(new User("Rodolphe", "Malo", "rod@gmail.com"));
		this.userRepository.save(new User("Loise", "Malo", "loise@gmail.com"));
		this.userRepository.save(new User("Sophia", "Malo", "soso@gmail.com"));
	}
}
