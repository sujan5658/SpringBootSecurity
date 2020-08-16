package com.springboot.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_pass")
	private String password;
	
	@Column(name="invalid_count")
	private int invalidCount;
	
	@Column(name="present_status")
	private boolean presentStatus;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(
			name = "user_user_role",
			joinColumns = @JoinColumn(name="user_id")
			)
	private List<Role> roles = new ArrayList<Role>();


	public User() {
		this.id = 0;
		this.userName = "";
		this.password = "";
		this.invalidCount = 0;
		this.presentStatus = true;
		this.roles = null;
	}
	
	public User(int id, String userName, String password, int invalidCount, boolean presentStatus, List<Role> roles) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.invalidCount = invalidCount;
		this.presentStatus = presentStatus;
		this.roles = roles;
	}
	
	public User(User user) {
		this.id = user.id;
		this.userName = user.userName;
		this.password = user.password;
		this.invalidCount = user.invalidCount;
		this.presentStatus = user.presentStatus;
		this.roles = user.roles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getInvalidCount() {
		return invalidCount;
	}

	public void setInvalidCount(int invalidCount) {
		this.invalidCount = invalidCount;
	}

	public boolean isPresentStatus() {
		return presentStatus;
	}

	public void setPresentStatus(boolean presentStatus) {
		this.presentStatus = presentStatus;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", invalidCount=" + invalidCount
				+ ", presentStatus=" + presentStatus + ", roles=" + roles + "]";
	}
}
