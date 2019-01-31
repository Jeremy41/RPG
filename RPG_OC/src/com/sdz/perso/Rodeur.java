package com.sdz.perso;


public class Rodeur extends Personnage
{
	public Rodeur(String pNom) 
	{
		super(pNom);
	}

	public void attaqueBasique(Personnage pPersonnage) 
	{
		System.out.println(this.getNom()+ " utilise tir a l'arc et inflige "+this.agilite+" dommages");
		System.out.println(pPersonnage.getNom()+ " perd "+ this.agilite+ " point de vie");
		pPersonnage.vie -= this.agilite;
	}


	public void attaqueSpeciale(Personnage personnage) 
	{
		System.out.println(this.getNom()+ " lance concentration et augmente son agilite de "+this.niveau/2+".");
		this.agilite += this.niveau/2;
	}
	
	public String toString() {return "Shshshshsh "+super.toString();}
	
}
