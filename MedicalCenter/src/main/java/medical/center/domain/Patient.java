package medical.center.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Patient{

	@OneToOne
	private User user;
	@OneToOne
	private Doctor doctorOfPatient;
	@OneToMany
	private List<Reservation> reservationsList;
	@OneToMany
	private List<Visit> visitsList;

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
