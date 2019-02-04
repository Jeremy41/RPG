package com.sdz.perso;

public abstract class Personnage 
{
	protected int niveau;
	protected int vie;
	protected int vieMax;
	protected int force;
	protected int agilite;
	protected int intelligence;
	protected String nom;
	
   
	public Personnage(String pNom)
	{
		nom = pNom;
		niveau = 0;
		vie = 0;
		vieMax = 0;
		force = 0;
		agilite = 0;
		intelligence = 0;
	}
	
	
	/////////////////////////
	////////METHODE/////////
	////////////////////////
	
	abstract public void attaqueBasique(Personnage personnage);
	abstract public void attaqueSpeciale(Personnage personnage);
	
	public String toString() {
		return "je suis le "+this.getClass().getSimpleName()+" "+ this.nom +" de niveau "+this.niveau+" je possède "+this.vieMax+" de vitalite, " + this.force+" de force, "+
				this.agilite+ " d'agilité et "+ this.intelligence + " d'inteligence !";
	}	
	
	/////////////////////////
	//////////SETTER/////////
	/////////////////////////
	
	
	public void setNiveau(int niveau) {
		this.niveau = niveau;
		
	}

	public void setVie(int vie) {
		this.vie = vie;
	}
	
	public void setVieMax(int vieMax) {
		this.vieMax = vieMax;
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
	
	public int getAgilite() {
		return agilite;
	}
}
