package com.sdz.perso;

import java.util.Scanner;

public class Combat 
{

	public static void lancementCombat(Personnage pPersonnage1, Personnage pPersonnage2)
	{

		
		if (verifVie(pPersonnage2) == true)		phaseCombat(pPersonnage1, pPersonnage2);
		else ;
		if (verifVie(pPersonnage1) == true)		phaseCombat(pPersonnage2, pPersonnage1);
		else ;

	}
	
	public static void phaseCombat (Personnage pPersonnage1, Personnage pPersonnage2)
	{
		Scanner sc = new Scanner(System.in);
		int choixJoueur = 0;
		
		System.out.println(pPersonnage1.getNom()+"("+pPersonnage1.getVie()+" vitalite ) veuillez choisir votre action (1 : Attque Basique, 2 : Attaque speciale");
		choixJoueur = sc.nextInt();
		if (choixJoueur == 1)																	pPersonnage1.attaqueBasique(pPersonnage2);
		else if (choixJoueur == 2 && pPersonnage1.getClass().getSimpleName() == "Guerrier" )	pPersonnage1.attaqueSpeciale(pPersonnage2);	
		else 																					pPersonnage1.attaqueSpeciale();

	}
	
	
	public static boolean verifVie(Personnage pPersonnage )
	{
		if (pPersonnage.getVie() <= 0) return false;
		else return true;
	}
	
}
