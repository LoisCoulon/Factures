package fr.epsi.controller;

import java.util.ArrayList;
import java.util.List;

public class ProduitController {

	public List<String> findByPrix() {
		// Appel EJB
		List<String> produits=new ArrayList<String>();
		produits.add("a");
		produits.add("b");
		return produits;
	}	
	
	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void create() {
		// TODO Auto-generated method stub
		
	}

}
