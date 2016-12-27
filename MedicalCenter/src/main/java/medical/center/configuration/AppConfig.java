package medical.center.configuration;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages =  "medical.center")
public class AppConfig {
	
	private final Logger logger = Logger.getLogger(AppConfig.class);
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		logger.info("Password Encoder");
		return new BCryptPasswordEncoder();
	}

	
}
