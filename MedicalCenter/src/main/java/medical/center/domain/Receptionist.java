package medical.center.domain;

import java.util.List;

import javax.persistence.OneToOne;

public class Receptionist {

	@OneToOne
	private User user;
	private int salary;
	private List<FreeDay> freeDays;

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
