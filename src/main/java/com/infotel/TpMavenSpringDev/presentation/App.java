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
    	
    	Dev d = context.getBean("d", Dev.class);
    	System.out.println(d);

    	DevLogiciel dl = context.getBean("dl", DevLogiciel.class);
    	System.out.println(dl); 
    	
    	Formation f = context.getBean("f", Formation.class);
    	f.setIdFormation(1);
    	f.setNomFormation("Java");
    	System.out.println(f);
    	
    	Etudiant e = context.getBean("e", Etudiant.class);
    	e.setId(1);
    	e.setNom("Jane");
    	e.setPrenom("Mary");
    	e.setFormation(f);
    	System.out.println(e);
    	
    	Iservice service2 = context.getBean("service2", ServiceImpl.class); 
    	Iservice service = context.getBean("service", ServiceImpl.class); 
    	
    	service2.ajouterDev(d);
    	service2.ajouterDevLogiciel(dl);
    	service.ajouterFormation(f);	
    	service.ajouterEtudiant(e);
    	
    	context.close();
    }
}
