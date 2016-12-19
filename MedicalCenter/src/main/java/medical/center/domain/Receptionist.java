package medical.center.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Receptionist {

	@Id
	@GeneratedValue
	Long id;
	@Autowired
	@OneToOne(cascade=CascadeType.ALL , fetch = FetchType.EAGER)
	private User user;
	private int salary;
	@Autowired(required=false)
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<FreeDay> freeDays;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<FreeDay> getFreeDays() {
		return freeDays;
	}

	public void setFreeDays(List<FreeDay> freeDays) {
		this.freeDays = freeDays;
	}

}
