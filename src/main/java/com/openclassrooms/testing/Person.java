package com.openclassrooms.testing;

public class Person {

	private String nom;
	private String prenom;
	
	public Person(String nom, String prenom) {
		// TODO Auto-generated constructor stub
		this.nom = nom;
		this.prenom=prenom;
		
	}

	public String getFullName() {
		// TODO Auto-generated method stub
		return String.format("%s %s",nom,prenom);
	}




}
