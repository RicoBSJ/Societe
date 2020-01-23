package com.developpez.bean;

public class Langage {
	private long id = 0;
	private String nom = "";

	public Langage() {
	}

	public Langage(long id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String toString() {
		return "LANGAGE DE PROGRAMMATION : " + this.nom;
	}
}