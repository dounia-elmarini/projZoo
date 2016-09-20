package project.ZooGardien;

public abstract class Animal {
	
	private String m_nom;
	private int m_poid;
	protected Cry m_cry;

	Animal(String nom, int poid)
	{
		this.m_nom = nom;
		this.m_poid = poid;
	}
	
	public Cry crier()
	{
		System.out.println(this.m_cry.toString());
		return this.m_cry;
	}
}
