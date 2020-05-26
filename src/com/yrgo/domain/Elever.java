package com.yrgo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author danijela
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
	 * @author danijela
	 * @param firstName forenamn
	 * @param surname efternamn
	 * @param skola skola
	 * @param klass klass
	 */
	public Elever(String firstName, String surname, String skola, int klass) {
		this.firstName = firstName;
		this.surname = surname;
		this.skola = skola;
		this.klass = klass;
	}
	
	
	/**
	 * @author danijela
	 */
	public String toString() {
		return "Elev: " + this.firstName + " " + this.surname+ " "+this.skola+ " "+this.klass;
	}

	/**
	 * @author danijela
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @author danijela
	 * @param id set id
	 */

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @author danijela
	 * @return fornamn
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * @author danijela
	 * @param firstName set fornamn
	 */

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
/**
 * @author danijela
 * @return efternamn
 */
	public String getSurname() {
		return surname;
	}
	
	/**
	 * @author danijela
	 * @param surname set efternamn
	 */

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/**
	 * @author danijela
	 * @return skolas namn
	 */

	public String getSkola() {
		return skola;
	}
	
	/**
	 * @author danijela
	 * @param skola set skolas namn
	 */

	public void setSkola(String skola) {
		this.skola = skola;
	}
	
	/**
	 * @author danijela
	 * @return klass
	 */

	public int getKlass() {
		return klass;
	}

	/**
	 * @author danijela
	 * @param klass set klass
	 */
	public void setKlass(int klass) {
		this.klass = klass;
	}
}
