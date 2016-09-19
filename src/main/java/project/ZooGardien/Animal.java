package project.ZooGardien;

public abstract class Animal {
	
	private String m_nom;

	Animal(String nom)
	{
		this.m_nom = nom;
	}
	
	abstract void crier();
}
