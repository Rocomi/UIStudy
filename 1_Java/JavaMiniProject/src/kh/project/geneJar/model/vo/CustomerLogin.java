package kh.project.geneJar.model.vo;

import java.io.Serializable;

public class CustomerLogin implements Serializable {
	
	private String id;
	private String name;
	private String password;
	
	public CustomerLogin() {
		super();
	}
	
	public CustomerLogin(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.format("회원이름 = %-10s\t id = %-10s\t password = %-10s", name, id, password);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
