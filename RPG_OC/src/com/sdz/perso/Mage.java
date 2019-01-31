package com.sdz.perso;

public class Mage extends Personnage
{
	public Mage(String pNom) 
	{
		super(pNom);
	}


	public void attaqueBasique(Personnage pPersonnage) 
	{
		System.out.println(this.getNom()+ " utilise Boule de Feu et inflige "+this.intelligence+" dommages");
		System.out.println(pPersonnage.getNom()+ " perd "+ this.intelligence+ " point de vie");
		pPersonnage.vie -= this.intelligence;
	}


	public void attaqueSpeciale(Personnage personnage) 
	{
		int vieRecup = 0;
		
		this.vie += vieRecup = this.verifVieMax();
		System.out.println(this.getNom()+ " lance Soin et se soigne de "+vieRecup+".");
	}
	
	public String toString() {return "Abracadabra "+super.toString();}
	
	public int verifVieMax()
	{
		if (this.vie + this.intelligence*2 > this.vieMax) return this.vieMax-this.vie;
		else 											  return this.intelligence*2;
	}
	
}
