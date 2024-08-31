package springsc.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String userName;
	private String password;
	private String authentication;
	
	
	public User(Long id, String userName, String password, String authentication) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.authentication = authentication;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getAuthentication() {
		return authentication;
	}


	public void setAuthentication(String authentication) {
		this.authentication = authentication;
	}

	public User() {
		
	}
}
