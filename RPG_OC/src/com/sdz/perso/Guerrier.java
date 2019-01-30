package com.sdz.perso;


public class Guerrier extends Personnage
{
	public Guerrier(String pNom) 
	{
		super(pNom);
	}

	public void attaqueBasique(Personnage personnage) 
	{
		
		personnage.vie -= this.force;
	}

	public void attaqueSpeciale(Personnage personnage) 
	{
		this.vie -= this.force/2;
		personnage.vie -= this.force*2;
	}

	@Override
	public void attaqueSpeciale() {
		// TODO Auto-generated method stub
		
	}
}
