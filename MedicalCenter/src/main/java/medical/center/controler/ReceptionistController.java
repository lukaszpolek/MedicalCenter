package medical.center.controler;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import medical.center.app.ReceptionistGenerator;
import medical.center.domain.Receptionist;
import medical.center.repository.ReceptionistRepository;

@RestController
public class ReceptionistController {

	@Autowired
	private final ReceptionistRepository receptionistRepository;
	private final ReceptionistGenerator receptionistGenerator;
	private static final Logger logger = Logger.getLogger(ReceptionistController.class);

	

	public ReceptionistController(ReceptionistRepository receptionistRepository,
			ReceptionistGenerator receptionistGenerator) {
		this.receptionistRepository = receptionistRepository;
		this.receptionistGenerator = receptionistGenerator;
	}

	
	@PostConstruct
	public void runAtStart() {
		receptionistRepository.save(receptionistGenerator.generate());
	}

	@GetMapping("/getRecepcionist")
	public Receptionist getReceptionist() {
		logger.info("Get Receptionist");
		return receptionistRepository.getOne(1L);
	}

}
