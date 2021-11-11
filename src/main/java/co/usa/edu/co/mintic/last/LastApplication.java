package co.usa.edu.co.mintic.last;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 *
 * @author ana_o
 */
@SpringBootApplication
@EntityScan(basePackages = {"co.usa.edu.co.mintic.last.model"})
public class LastApplication {

	public static void main(String[] args) {
		SpringApplication.run(LastApplication.class, args);
	}

}
