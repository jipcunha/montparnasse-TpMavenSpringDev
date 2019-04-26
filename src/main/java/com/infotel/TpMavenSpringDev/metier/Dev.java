package com.infotel.TpMavenSpringDev.metier;

public class Dev {
	private int id;
	private String nom;
	private int experience;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Dev [id=" + id + ", nom=" + nom + ", experience=" + experience + "]";
	}
	
	
}
