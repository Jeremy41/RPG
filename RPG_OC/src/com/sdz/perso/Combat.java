package com.sdz.perso;

import java.util.Scanner;

/**
 * On verifie avant chaque phase de combat que les deux personnages sont en vie via verifVie
 * On utilise la methode phaseCombat() pour genéré une phase de combat.
 * Une fois que que un personnage a sa vie < 0 on verifie qui a gagné car il est possible
 * que les deux personnages perdent à cause de l'attaque 2 du Guerrier.
 */	

public class Combat 
{

	public static void lancementCombat(Personnage pPersonnage1, Personnage pPersonnage2)
	{

		while (verifVie(pPersonnage1) == true && verifVie(pPersonnage2) == true) 
		{
		if (verifVie(pPersonnage1) == true && verifVie(pPersonnage2) == true)		phaseCombat(pPersonnage1, pPersonnage2);
		else System.out.println(pPersonnage1.getNom()+" est mort");
		if (verifVie(pPersonnage1) == true && verifVie(pPersonnage2) == true)		phaseCombat(pPersonnage2, pPersonnage1);
		else System.out.println(pPersonnage2.getNom()+" est mort"); 
		}
		
		if (!verifVie(pPersonnage1)) System.out.println(pPersonnage1.getNom()+" a perdu !");
		if (!verifVie(pPersonnage2)) System.out.println(pPersonnage2.getNom()+" a perdu !"); 
	}
	
	
	public static void phaseCombat (Personnage pPersonnage1, Personnage pPersonnage2)
	{
		Scanner sc = new Scanner(System.in);
		int choixJoueur = 0;
		
		while (verifChoix(choixJoueur))
		{
		System.out.println(pPersonnage1.getNom()+" ("+pPersonnage1.getVie()+" vitalite) veuillez choisir votre action (1 : Attaque Basique, 2 : Attaque spéciale)");
		choixJoueur = sc.nextInt();
		if (choixJoueur == 1)																	pPersonnage1.attaqueBasique(pPersonnage2);
		else																					pPersonnage1.attaqueSpeciale(pPersonnage2);
		}
	}
	
	///////////////////////////
	//VERFICATION DES VALEURS//
	///////////////////////////
	
	public static boolean verifVie(Personnage pPersonnage )
	{
		if (pPersonnage.getVie() <= 0) return false;
		else return true;
}
	
	public static boolean verifChoix(int pChoixJoueur )
	{
		if (pChoixJoueur > 0 && pChoixJoueur < 3) return false;
		else return true;
	}
}
