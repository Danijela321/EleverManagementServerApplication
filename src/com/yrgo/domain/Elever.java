package com.yrgo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Danijela
 *
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
	
	/**
	 * @author Danijela
	 * 
	 * @param firstName
	 * @param surname
	 * @param skola
	 * @param klass
	 */
	public Elever(String firstName, String surname, String skola, int klass) {
		this.firstName = firstName;
		this.surname = surname;
		this.skola = skola;
		this.klass = klass;
	}
	
	
	/**
	 * @author Danijela
	 */
	public String toString() {
		return "Elev: " + this.firstName + " " + this.surname+ " "+this.skola+ " "+this.klass;
	}

	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @param id
	 */

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * 
	 * @param firstName
	 */

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
/**
 * 
 * @return
 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * 
	 * @param surname
	 */

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/**
	 * 
	 * @return
	 */

	public String getSkola() {
		return skola;
	}
	
	/**
	 * 
	 * @param skola
	 */

	public void setSkola(String skola) {
		this.skola = skola;
	}
	
	/**
	 * 
	 * @return
	 */

	public int getKlass() {
		return klass;
	}

	/**
	 * 
	 * @param klass
	 */
	public void setKlass(int klass) {
		this.klass = klass;
	}
}
