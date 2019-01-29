package com.sdz.perso;

import java.util.Scanner;

/**
 * @author jeremy
 *
 */

public class MainRPG {

	public static void main(String[] args) 
	{
		Personnage personnage1 = null;
		personnage1 = initialisation(personnage1);
		System.out.println(personnage1);
		Personnage personnage2 = null;
		personnage2 = initialisation(personnage2);
		System.out.println(personnage2);
	}
	
	
	public static Personnage initialisation(Personnage personnage)
	{
		personnage = initialisationClasse(personnage);
		initialisationNiveau(personnage);
		initialisationStatistique(personnage);
		
		return personnage;
	}
	
	
	public static Personnage initialisationClasse(Personnage personnage)
	{
		int typeClasse = 0;
		int i  = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (i == 0)
		{
		System.out.println("Veuillez choisir la classe de votre personnage : (1. Guerrier, 2. Rodeur, 3. Mage) ");
		typeClasse = sc.nextInt();
		i = verificationChoix(typeClasse);
		}
		
		if 		(typeClasse == 1)				personnage = new Guerrier();
		else if (typeClasse == 2)				personnage = new Rodeur();
		else if	(typeClasse == 3)				personnage = new Mage();
		
		return personnage;
	}
	
	
	public static void initialisationNiveau (Personnage personnage)
	{
		int niveau = 0;
		int i = 0;
		
		Scanner sc = new Scanner(System.in);
		while (i == 0)
		{
		System.out.println("Niveau de personnage ?");
		niveau = sc.nextInt();
		i = verificationNiveau(niveau);
		}
		
		personnage.setNiveau(niveau);
		personnage.setVie(niveau*2);
	}
	
	
	public static void initialisationStatistique(Personnage personnage)
	{
		int force =0 , agilite = 0, intelligence = 0, i =0, total; 
		
		Scanner sc = new Scanner(System.in);
		
		while (i == 0)
		{
		System.out.println("Force du personnage ?");
		force = sc.nextInt();
		System.out.println("agilite du personnage ?");
		agilite = sc.nextInt();
		System.out.println("intelligence du personnage ?");
		intelligence = sc.nextInt();
		i = verificationStatistique(force+agilite+intelligence, personnage.getNiveau());
		}
		
		personnage.setForce(force);
		personnage.setAgilite(agilite);
		personnage.setIntelligence(intelligence);
		
	}
	
	
	
	//////////////////////////
	//VERFICATION DES VALEUR//
	//////////////////////////
	
	
	public static int verificationChoix(int choix)
	{
		if (choix < 1 || choix > 3) return 0;
		return 1;
	}
	
	
	public static int verificationStatistique(int total, int niveau)
	{
		if (total > niveau || total < niveau ) return 0;
		return 1;
	}
	
	public static int verificationNiveau(int niveau)
	{
		if (niveau < 1 || niveau > 100) return 0;
		return 1;
	}	
}
