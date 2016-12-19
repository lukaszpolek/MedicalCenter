package medical.center.configuration;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig;
import org.jasypt.hibernate4.encryptor.HibernatePBEStringEncryptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = "medical.center")
public class HibernateConfiguration {

	
//	@Bean
//	@Lazy(false)
	public EnvironmentStringPBEConfig encryptorConfiguration(){
		
		EnvironmentStringPBEConfig encryptor = new EnvironmentStringPBEConfig();
		encryptor.setAlgorithm("PBEWithMD5AndDES");
		encryptor.setPasswordSysPropertyName("beaver.encryption.password");
		return encryptor;
	}
	
//	@Bean
//	@Lazy(false)
	public StandardPBEStringEncryptor standardStringEncryptor(){
		
		StandardPBEStringEncryptor stringEncryptor = new StandardPBEStringEncryptor();
		stringEncryptor.setConfig(encryptorConfiguration());
		return stringEncryptor;
	}
	
	@Bean
	@Autowired
	public HibernatePBEStringEncryptor hibernateStringEncryptor(){
		HibernatePBEStringEncryptor stringEncryptor = new HibernatePBEStringEncryptor();
		stringEncryptor.setEncryptor(standardStringEncryptor());
		stringEncryptor.setRegisteredName("hibernateStringEncryptor");
		return stringEncryptor;
	}
	
	
//	@Bean
//	public Jackson2ObjectMapperBuilder configureObjectMapper() {
//	    return new Jackson2ObjectMapperBuilder()
//	        .modulesToInstall(Hibernate4Module.class);
//	}
	
}
