package medical.center.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FreeDay {

	@Id
	@GeneratedValue
	private Long id;
	private Date freeDay;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFreeDay() {
		return freeDay;
	}

	public void setFreeDay(Date freeDay) {
		this.freeDay = freeDay;
	}

}
