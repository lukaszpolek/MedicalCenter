package medical.center.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class User {
	@Id
	@GeneratedValue
	private Long id;
	private String login;
	//@ColumnTransformer(write = "EncryptByPassPhrase('12',?)", read = "DECRYPTBYPASSPHRASE ('12',pswd)")
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private LocalDate bornDate;
	@CreatedDate
	private LocalDateTime createTime;
	@LastModifiedDate
	private LocalDateTime modDate;
	@Transient
	private final static String[] rolesArray = { "Admin", "Doctor", "Patient", "Receptionist" };
	private int role;
	@OneToMany(cascade = CascadeType.ALL)
	@Column(nullable = true)
	private List<UserMessage> userMessagesRecive;
	@OneToMany(cascade = CascadeType.ALL)
	@Column(nullable = true)
	private List<UserMessage> userMessagesSend;

	public static String[] getRolesArray() {
		return rolesArray;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public void setModDate(LocalDateTime modDate) {
		this.modDate = modDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstMame) {
		this.firstName = firstMame;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getBornDate() {
		return bornDate;
	}

	public void setBornDate(LocalDate bornDate) {
		this.bornDate = bornDate;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String[] getRoles() {
		return rolesArray;
	}

	public List<UserMessage> getUserMessagesRecive() {
		return userMessagesRecive;
	}

	public void setUserMessagesRecive(List<UserMessage> userMessagesRecive) {
		this.userMessagesRecive = userMessagesRecive;
	}

	public List<UserMessage> getUserMessagesSend() {
		return userMessagesSend;
	}

	public void setUserMessagesSend(List<UserMessage> userMessagesSend) {
		this.userMessagesSend = userMessagesSend;
	}

	public String getRoleByName(int role) {
		return rolesArray[role];
	}

}
