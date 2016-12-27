package medical.center.domain;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class FreeDay {

	@Id
	@GeneratedValue
	private Long id;
	
	private LocalDate freeDay;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFreeDay() {
		return freeDay;
	}

	public void setFreeDay(LocalDate freeDay) {
		this.freeDay = freeDay;
	}

}
