package medical.center.controler;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import medical.center.app.UserGenerator;
import medical.center.domain.User;
import medical.center.repository.UserRepository;

@RestController
public class UsersControler {

	@Autowired
	private final UserRepository userRepository;
	private final UserGenerator userGenerator;

	public UsersControler(UserRepository userRepository, UserGenerator userGenerator) {
		this.userRepository = userRepository;
		this.userGenerator = userGenerator;
	}
	
	@PostConstruct
	private void runAtStart(){
		userRepository.save(userGenerator.generate());
	}

	@GetMapping("/getUser")
	public User getUser() {

		return userRepository.findOne(1L);
	}
}
