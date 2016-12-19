package medical.center.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Visit {
	
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private Patient patient;	
	@ManyToOne
	private Doctor doctor;
	private LocalDate visiteDate;
	@Column(nullable=true)
	private String suggestionsTreatment;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public LocalDate getVisiteDate() {
		return visiteDate;
	}
	public void setVisiteDate(LocalDate visiteDate) {
		this.visiteDate = visiteDate;
	}
	public String getSuggestionsTreatment() {
		return suggestionsTreatment;
	}
	public void setSuggestionsTreatment(String suggestionsTreatment) {
		this.suggestionsTreatment = suggestionsTreatment;
	}
	
	

}
