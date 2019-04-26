package com.infotel.TpMavenSpringDev.dao;

import org.springframework.stereotype.Repository;

import com.infotel.TpMavenSpringDev.metier.Dev;
import com.infotel.TpMavenSpringDev.metier.DevLogiciel;
import com.infotel.TpMavenSpringDev.metier.Etudiant;
import com.infotel.TpMavenSpringDev.metier.Formation;

@Repository("dao")
public class DaoImpl implements Idao {

	@Override
	public int ajouterDev(Dev d) {
		// TODO Auto-generated method stub
		System.out.println("Dev ajouté");
		return d.getId();
	}

	@Override
	public int ajouterDevLogiciel(DevLogiciel dl) {
		// TODO Auto-generated method stub
		System.out.println("DevLog ajouté");
		return 0;
	}

	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		System.out.println("Etudiant ajouté");
		return e.getId();
	}

	@Override
	public int ajouterFormation(Formation f) {
		// TODO Auto-generated method stub
		System.out.println("Formation ajoutée");
		return f.getIdFormation();
	}
	
}
