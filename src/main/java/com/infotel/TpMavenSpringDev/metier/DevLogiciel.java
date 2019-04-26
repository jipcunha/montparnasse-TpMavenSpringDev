package com.infotel.TpMavenSpringDev.metier;

public class DevLogiciel {
	private Dev developpeur;
	private Dev chefDeveloppeur;
	
	public Dev getDeveloppeur() {
		return developpeur;
	}
	public void setDeveloppeur(Dev developpeur) {
		this.developpeur = developpeur;
	}
	public Dev getChefDeveloppeur() {
		return chefDeveloppeur;
	}
	public void setChefDeveloppeur(Dev chefDeveloppeur) {
		this.chefDeveloppeur = chefDeveloppeur;
	}
	@Override
	public String toString() {
		return "DevLogiciel [developpeur=" + developpeur + ", chefDeveloppeur=" + chefDeveloppeur + "]";
	}
	
	
}
