package com.sdz.perso;


public class Guerrier extends Personnage
{
	public Guerrier(String pNom) 
	{
		super(pNom);
	}

	public void attaqueBasique(Personnage pPersonnage) 
	{
		System.out.println(this.getNom()+ " utilise coup d'épée et inflige "+this.force+"dommages");
		System.out.println(pPersonnage.getNom()+ " perd "+ this.force+ " point de vie");
		pPersonnage.vie -= this.force;
	}

	public void attaqueSpeciale(Personnage pPersonnage) 
	{
		System.out.println(this.getNom()+ " utilise Coup de Rage et inflige "+this.force*2+"dommages");
		System.out.println(this.getNom()+ " perd " + this.force/2 + " point de vie");
		this.vie -= this.force/2;
		pPersonnage.vie -= this.force*2;
	}

}
