package com.yrgo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
  * @author Danijela
  */

@Entity
@XmlRootElement
public class Elever implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String surname;
	private String skola;
	private int klass;
	
	public Elever() {}
	
	public Elever(String firstName, String surname, String skola, int klass) {
		this.firstName = firstName;
		this.surname = surname;
		this.skola = skola;
		this.klass = klass;
	}
	
	public String toString() {
		return "Elev: " + this.firstName + " " + this.surname+ " "+this.skola+ " "+this.klass;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSkola() {
		return skola;
	}

	public void setSkola(String skola) {
		this.skola = skola;
	}

	public int getKlass() {
		return klass;
	}

	public void setKlass(int klass) {
		this.klass = klass;
	}
}
