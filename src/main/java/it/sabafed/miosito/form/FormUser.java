package it.sabafed.miosito.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import it.sabafed.miosito.model.User;

public class FormUser {
	
	private long id;
	
	@NotEmpty
	@Size(min = 2, max = 45)
	private String name;

	public FormUser() {
		super();
	}
	
	public User getUser() {
		
		User user = new User();
		user.setId(id);
		user.setName(name);

		return user;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
