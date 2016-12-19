package medical.center.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Doctor{

	@Id
	@GeneratedValue
	Long id;
	@OneToOne(cascade=CascadeType.ALL)
	private User user;
	@Autowired(required=false)
	@OneToMany
	private List<HoursOfWork> hoursOfWork;
	@Autowired(required=false)
	@OneToMany
	private List<FreeDay> freeDays;
	@Autowired(required=false)
	@OneToMany
	private List<Reservation> reservationList;
	@Autowired(required=false)
	@OneToMany
	private List<Visit> visitsList;
	private int salary;
	
	
	

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

	public List<Visit> getVisitsList() {
		return visitsList;
	}

	public void setVisitsList(List<Visit> visitsList) {
		this.visitsList = visitsList;
	}

	public List<FreeDay> getFreeDays() {
		return freeDays;
	}

	public void setFreeDays(List<FreeDay> freeDays) {
		this.freeDays = freeDays;
	}

	public List<Reservation> getReservationList() {
		return reservationList;
	}

	public void setReservationList(List<Reservation> reservationList) {
		this.reservationList = reservationList;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<HoursOfWork> getHoursOfWork() {
		return hoursOfWork;
	}

	public void setHoursOfWork(List<HoursOfWork> hoursOfWork) {
		this.hoursOfWork = hoursOfWork;
	}

}
