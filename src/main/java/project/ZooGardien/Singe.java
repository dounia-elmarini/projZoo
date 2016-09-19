package project.ZooGardien;

public class Singe extends Animal {

	Singe(String nom, int poids) 
	{
		super(nom, poids);
		super.m_cry = new Cry("Hurler");
	}

}
