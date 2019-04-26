package com.infotel.TpMavenSpringDev.service;

import com.infotel.TpMavenSpringDev.metier.Dev;
import com.infotel.TpMavenSpringDev.metier.DevLogiciel;
import com.infotel.TpMavenSpringDev.metier.Etudiant;
import com.infotel.TpMavenSpringDev.metier.Formation;

public interface Iservice {
	
	public int ajouterDev(Dev d);
	public int ajouterDevLogiciel(DevLogiciel dl);
	public int ajouterEtudiant(Etudiant e);
	public int ajouterFormation(Formation f);
}
