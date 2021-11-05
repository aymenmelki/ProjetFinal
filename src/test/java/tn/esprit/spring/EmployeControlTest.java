package tn.esprit.spring;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.EmployeServiceImpl;

@SpringBootTest
public class EmployeControlTest {
	@Autowired
	EmployeServiceImpl es;
	
	
	@Test(expected=NullPointerException.class)
	public void testajouterEmploye() throws ParseException
	{
		
		Employe e=new Employe("aymen","melki","aymen.melk@esprit.tn",true,Role.ADMINISTRATEUR);
		int c= es.ajouterEmploye(e);
		assertThat(c).isGreaterThan(0);
		Assert.assertTrue(c>0);
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testListEmploye() {
	//List<Employe> e = (List<Employe>) es.findAll();
		List<Employe> e=es.getAllEmployes();
		int n=e.size();
	assertThat(n>0);
	}
	
	
	
	
	
}
