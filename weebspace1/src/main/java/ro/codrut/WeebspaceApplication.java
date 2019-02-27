package ro.codrut;

import com.datastax.driver.core.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.codrut.storage.dao.UserDAO;
import ro.codrut.storage.dao.entities.Person;

import java.util.Date;

@SpringBootApplication
public class WeebspaceApplication implements CommandLineRunner{

	@Autowired
	private UserDAO userDAO;

	public static void main(String[] args) {
		SpringApplication.run(WeebspaceApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		Person person = new Person("Mihai","123","email",null);
		userDAO.insert(person);

		userDAO.findByName("Mihai").forEach(System.out::println);
	}
}
