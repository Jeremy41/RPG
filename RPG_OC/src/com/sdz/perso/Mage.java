package com.sdz.perso;

public class Mage extends Personnage
{
	public Mage(String pNom) 
	{
		super(pNom);
	}


	public void attaqueBasique(Personnage pPersonnage) 
	{
		System.out.println(this.getNom()+ " utilise Boule de Feu et inflige "+this.intelligence+"dommages");
		System.out.println(pPersonnage.getNom()+ " perd "+ this.intelligence+ " point de vie");
		pPersonnage.vie -= this.intelligence;
	}


	public void attaqueSpeciale() 
	{
		System.out.println(this.getNom()+ " lance Soin et se soigne de "+this.intelligence*2+"."); //mettre en place verif
		this.vie += this.intelligence*2;
	}
}
