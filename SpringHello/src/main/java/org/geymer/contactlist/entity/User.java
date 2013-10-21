package org.geymer.contactlist.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Users")
public class User {
@Id
int id;
@Column(name="name")
String name;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Column(name="pass")
String pass;



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}
}
