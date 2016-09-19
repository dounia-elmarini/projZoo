package project.ZooGardien;

public class Chat extends Animal {

	Chat(String nom, int poids) 
	{
		super(nom, poids);
		super.m_cry = new Cry("Miauler");
	}
}
