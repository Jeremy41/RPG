package com.sdz.perso;


public class Rodeur extends Personnage
{
	public Rodeur(String pNom) 
	{
		super(pNom);
	}

	public void attaqueBasique(Personnage personnage) 
	{
		personnage.vie -= this.agilite;
	}

	public void attaqueSpeciale(Personnage personnage) 
	{
		this.agilite += this.niveau/2;
	}

	@Override
	public void attaqueSpeciale() {
		// TODO Auto-generated method stub
		
	}
}
