package com.sdz.perso;

import java.util.Scanner;

public class Combat 
{

	public static void lancementCombat(Personnage pPersonnage1, Personnage pPersonnage2)
	{

		while (verifVie(pPersonnage1) == true && verifVie(pPersonnage2) == true) {
		if (verifVie(pPersonnage1) == true && verifVie(pPersonnage2) == true)		phaseCombat(pPersonnage1, pPersonnage2);
	//	else System.out.println(pPersonnage2.getNom()+" est mort");
		if (verifVie(pPersonnage1) == true && verifVie(pPersonnage2) == true)		phaseCombat(pPersonnage2, pPersonnage1);
	//	else System.out.println(pPersonnage1.getNom()+" est mort"); 
		}
		
		if (verifVie(pPersonnage1) == false) System.out.println(pPersonnage1.getNom()+" a perdu");
		if (verifVie(pPersonnage2) == false) System.out.println(pPersonnage2.getNom()+" a perdu"); 
	}
	
	public static void phaseCombat (Personnage pPersonnage1, Personnage pPersonnage2)
	{
		Scanner sc = new Scanner(System.in);
		int choixJoueur = 0;
		
		System.out.println(pPersonnage1.getNom()+"("+pPersonnage1.getVie()+" vitalite ) veuillez choisir votre action (1 : Attque Basique, 2 : Attaque speciale");
		choixJoueur = sc.nextInt();
		if (choixJoueur == 1)																	pPersonnage1.attaqueBasique(pPersonnage2);
		else if (choixJoueur == 2 && pPersonnage1.getClass().getSimpleName() == "Guerrier" )	pPersonnage1.attaqueSpeciale(pPersonnage2);	
		else																					pPersonnage1.attaqueSpeciale();
	}
	
	
	public static boolean verifVie(Personnage pPersonnage )
	{
		if (pPersonnage.getVie() <= 0) return false;
		else return true;
	}
	
}
