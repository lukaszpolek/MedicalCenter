package medical.center.domain;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {

	@Id
	@GeneratedValue
	private Long id;
	private LocalDateTime reservationFromDate;
	private LocalDateTime reservationToDate;
	@ManyToOne
	@JoinColumn(name = "patient")
	private Patient patient;
	@ManyToOne
	@JoinColumn(name = "reservationsList")
	private Doctor doctor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getReservationFromDate() {
		return reservationFromDate;
	}

	public void setReservationFromDate(LocalDateTime reservationFromDate) {
		this.reservationFromDate = reservationFromDate;
	}

	public LocalDateTime getReservationToDate() {
		return reservationToDate;
	}

	public void setReservationToDate(LocalDateTime reservationToDate) {
		this.reservationToDate = reservationToDate;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

}
