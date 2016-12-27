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
public class Patient {

	@Id
	@GeneratedValue
	Long id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private User user;
	
	@Autowired(required=false)
	@OneToOne
	private Doctor doctorOfPatient;
	
	@Autowired(required=false)
	@OneToMany
	private List<Reservation> reservationsList;
	
	@Autowired(required=false)
	@OneToMany
	private List<Visit> visitsList;

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

	public List<Reservation> getReservationsList() {
		return reservationsList;
	}

	public void setReservationsList(List<Reservation> reservationsList) {
		this.reservationsList = reservationsList;
	}

	public List<Visit> getVisitsList() {
		return visitsList;
	}

	public void setVisitsList(List<Visit> visitsList) {
		this.visitsList = visitsList;
	}

	public Doctor getDoctorOfPatient() {
		return doctorOfPatient;
	}

	public Doctor getDoctorOfPatienT() {
		return doctorOfPatient;
	}

	public void setDoctorOfPatient(Doctor doctorOfPatient) {
		this.doctorOfPatient = doctorOfPatient;
	}

	public List<Reservation> getReservations() {
		return reservationsList;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservationsList = reservations;
	}

}
