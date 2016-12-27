package medical.center.app;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import medical.center.domain.Receptionist;
import medical.center.domain.User;

@Service
public class ReceptionistGenerator {

	@Autowired
	private PasswordEncoder encoder;



	public Receptionist generate() {
		User user = new User();
		user.setBornDate(LocalDate.of(2010, 05, 21));
		user.setEmail("kuba@o2.pl");
		user.setFirstName("Adam");
		user.setLastName("Polek");
		user.setLogin("kuba");
		user.setPassword(encoder.encode("password"));
		user.setPhone("122223442");
		user.setRole(3);
		Receptionist receptionist = new Receptionist();
		receptionist.setSalary(1500);
		receptionist.setUser(user);
		return receptionist;

	}

}
