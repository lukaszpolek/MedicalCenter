package medical.center.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories("medical.center.*")
@ComponentScan("medical.center.*")
@EntityScan("medical.center.*")   
@EnableTransactionManagement
public class MedicalCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalCenterApplication.class, args);
//		Generator.generate();
		
//		EntityManagerFactory entityMenagerFactory = Persistence.createEntityManagerFactory("medicalcenter");
//		EntityManager entityManager = entityMenagerFactory.createEntityManager();
//		
//		entityManager.close();
//		entityMenagerFactory.close();
	}
}
