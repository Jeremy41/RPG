package com.sdz.perso;


/**
 * RPG Bienvenue dans MagiWorld !
 * @author jeremy
 *
 */


// faire javadoc
// corriger faute de frappe
// fermer les scanners
// faire verification choix attaque ( choix 1 ou 2 uniquement)

public class MainRPG {

	public static void main(String[] args) 
	{
		Personnage personnage1 = null;
		personnage1 = InitialisationPerso.initialisation(personnage1, "Joueur 1");
		System.out.println(personnage1);
		Personnage personnage2 = null;
		personnage2 = InitialisationPerso.initialisation(personnage2, "Joueur 2");
		System.out.println(personnage2);
		
		Combat.lancementCombat(personnage1,personnage2);
	}
}
