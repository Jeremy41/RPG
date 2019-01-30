package com.sdz.perso;

public class Mage extends Personnage
{
	public Mage(String pNom) 
	{
		super(pNom);
	}


	public void attaqueBasique(Personnage personnage) 
	{
		personnage.vie -= this.intelligence;
	}

	public void attaqueSpeciale(Personnage personnage) 
	{
		this.vie += this.intelligence*2;
	}


	@Override
	public void attaqueSpeciale() {
		// TODO Auto-generated method stub
		
	}
}
