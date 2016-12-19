package medical.center.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HoursOfWork {

	@Id
	@GeneratedValue
	private Long id;
	private int numberOfDayOfWeek;
	private int fromHour;
	private int toHour;

	public HoursOfWork() {

	}

	public HoursOfWork(Long id, int numberOfDayOfWeek, int fromHour, int toHour) {
		this.id = id;
		this.numberOfDayOfWeek = numberOfDayOfWeek;
		this.fromHour = fromHour;
		this.toHour = toHour;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNumberOfDayOfWeek() {
		return numberOfDayOfWeek;
	}

	public void setNumberOfDayOfWeek(int numberOfDayOfWeek) {
		this.numberOfDayOfWeek = numberOfDayOfWeek;
	}

	public int getFromHour() {
		return fromHour;
	}

	public void setFromHour(int fromHour) {
		this.fromHour = fromHour;
	}

	public int getToHour() {
		return toHour;
	}

	public void setToHour(int toHour) {
		this.toHour = toHour;
	}

}
