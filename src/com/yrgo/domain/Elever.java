package com.yrgo.domain;
/**
 * 
 * @author Danijela
 *
 */

public class Elever implements java.io.Serializable{
	private String firstName;
	private String surname;
	private String skola;
	private int klass;
	
	public Elever(String firstName, String surname, String skola, int klass) {
		this.firstName = firstName;
		this.surname = surname;
		this.skola = skola;
		this.klass = klass;
	}
	
	public String toString() {
		return "Elev: " + this.firstName + " " + this.surname+ " "+this.skola+ " "+this.klass;
	}
}
