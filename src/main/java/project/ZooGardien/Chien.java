package project.ZooGardien;

public class Chien extends Animal {

	Chien(String nom, int poids)
	{
		super(nom, poids);
		super.m_cry = new Cry("Aboyer");
	}	
}
