package medical.center.app;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import medical.center.domain.Receptionist;
import medical.center.domain.User;

@Service
public class ReceptionistGenerator {

//
//	private final UsersRepository usersRepository;
//	
//	
//	@Autowired
//	public Generator(UsersRepository usersRepository) {
//		this.usersRepository = usersRepository;
//	}
//	
	



	public Receptionist generate() {
		User user = new User();
		user.setBornDate(LocalDate.of(2010, 05, 21));
		user.setEmail("kuba@o2.pl");
		user.setFirstName("Kuba");
		user.setLastName("Polek");
		user.setLogin("kuba");
		user.setPassword("password");
		user.setPhone("122223442");
		user.setRole(3);
		Receptionist receptionist = new Receptionist();
		receptionist.setUser(user);
		receptionist.setSalary(1500);
		return receptionist;
		
	}

	
}
