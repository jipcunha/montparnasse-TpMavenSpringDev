package com.infotel.TpMavenSpringDev.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpringDev.service.Iservice;
import com.infotel.TpMavenSpringDev.service.ServiceImpl;
import com.infotel.TpMavenSpringDev.metier.Dev;
import com.infotel.TpMavenSpringDev.metier.DevLogiciel;
import com.infotel.TpMavenSpringDev.metier.Etudiant;
import com.infotel.TpMavenSpringDev.metier.Formation;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )  {
    	
   
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	Formation f = context.getBean("formation", Formation.class);
    	f.setIdFormation(1);
    	f.setNomFormation("Java");
    	System.out.println(f);
    	
    	Etudiant e = context.getBean("etudiant", Etudiant.class);
    	e.setId(1);
    	e.setNom("Jane");
    	e.setPrenom("Mary");
    	e.setFormation(f);
    	System.out.println(e);
    	
 
    	Iservice service = context.getBean("service", ServiceImpl.class); 
    	 	
    	service.ajouterFormation(f);	
    	service.ajouterEtudiant(e);
    	
    	Dev d = context.getBean("d", Dev.class);
    	System.out.println(d);

    	DevLogiciel dl = context.getBean("dl", DevLogiciel.class);
    	System.out.println(dl); 
    	
    	
    	
    	context.close();
    }
}
