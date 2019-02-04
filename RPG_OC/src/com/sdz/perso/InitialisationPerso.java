package com.sdz.perso;

import java.util.Scanner;

/**
 * Initialisation de mon personnage en 3 partie
 * 1. Attribution d'une specialite (Mage/Guerrier/Rodeur)
 * 2. Attribution du niveau
 * 3. Attribution des statistique
 */


public class InitialisationPerso {


	public static Personnage initialisation(Personnage personnage, String pNom)
	{
		System.out.println("Création du personnage du "+pNom);
		personnage = initialisationClasse(personnage, pNom);
		initialisationNiveau(personnage);
		initialisationStatistique(personnage);
		
		return personnage;
	}
	
/**
 * 1. Attribution d'une specialite (Mage/Guerrier/Rodeur)
 * 2. @return personnage
 * Verification saisie avec la methode verificationChoix()
 */	
	
	
	public static Personnage initialisationClasse(Personnage personnage, String pNom)
	{
		int typeClasse = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (verificationChoix(typeClasse))
		{
		System.out.println("Veuillez choisir la classe de votre personnage : (1 : Guerrier, 2 : Rodeur, 3 : Mage) ");
		typeClasse = sc.nextInt();
		}
		
		if 		(typeClasse == 1)				personnage = new Guerrier(pNom);
		else if (typeClasse == 2)				personnage = new Rodeur(pNom);
		else if	(typeClasse == 3)				personnage = new Mage(pNom);
		
		return personnage;
	}
	
/**
 * 2. Attribution du niveau
 * Verification saisie avec la methode VerificationNiveau()
 */	
	
	
	public static void initialisationNiveau (Personnage personnage)
	{
		int niveau = 0;
		
		Scanner sc = new Scanner(System.in);
		while (verificationNiveau(niveau))
		{
		System.out.println("Niveau du personnage ?");
		niveau = sc.nextInt();
		}
		
		personnage.setNiveau(niveau);
		personnage.setVieMax(niveau*5);
		personnage.setVie(niveau*5);
	}
	
/**
 * 3. Attribution des statistique
 * Verification saisie avec la methode verificationStatistique()
 */		
	
	
	public static void initialisationStatistique(Personnage personnage)
	{
		int force =0 , agilite = 0, intelligence = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		while (verificationStatistique(force+agilite+intelligence, personnage.getNiveau()))
		{
		System.out.println("Force du personnage ?");
		force = sc.nextInt();
		System.out.println("Agilité du personnage ?");
		agilite = sc.nextInt();
		System.out.println("Intelligence du personnage ?");
		intelligence = sc.nextInt();
		}
		
		personnage.setForce(force);
		personnage.setAgilite(agilite);
		personnage.setIntelligence(intelligence);	
	}
		
	//////////////////////////
	//VERFICATION DES VALEUR//
	//////////////////////////
	
	public static boolean verificationChoix(int choix)
	{
		if (choix < 1 || choix > 3) return true;
		return false;
	}
	
	public static boolean verificationStatistique(int total, int niveau)
	{
		if (total > niveau || total < niveau ) return true;
		return false;
	}
	
	public static boolean verificationNiveau(int niveau)
	{
		if (niveau < 1 || niveau > 100) return true;
		return false;
	}	
}
