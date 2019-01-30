package com.sdz.perso;

public abstract class Personnage 
{
	protected int niveau;
	protected int vie;
	protected int force;
	protected int agilite;
	protected int intelligence;
	protected String nom;
	
   
	public Personnage(String pNom)
	{
		nom = pNom;
		niveau = 0;
		vie = 0;
		force = 0;
		agilite = 0;
		intelligence = 0;
	}
	
	
	/////////////////////////
	////////METHODE/////////
	////////////////////////
	
	public void attaqueBasique(Personnage personnage) {}
	public void attaqueSpeciale(Personnage personnage) {}
	public void attaqueSpeciale() {}
	
	/////////////////////////
	//SETTER/
	/////////////////////////
	
	
	public void setNiveau(int niveau) {
		this.niveau = niveau;
		
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public void setAgilite(int agilite) {
		this.agilite = agilite;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public int getNiveau() {
		return niveau;
	}

	public String getNom() {
		return nom;
	}
	
	public int getVie() {
		return vie;
	}
	
	public String toString() {
		return "Woarg je suis le "+this.getClass().getSimpleName()+" "+ this.nom +" de niveau "+this.niveau+" je posséde "+this.vie+" de vitalite " + this.force+" de force "+
				this.agilite+ " d'agilite "+ this.intelligence + " d'inteligence";
	}
	
	
	
	
}
