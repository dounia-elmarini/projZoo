package project.ZooGardien;

import java.util.ArrayList;

public class Zoo {
	
	private ArrayList<Animal> m_listAnimal; 
	
	Zoo()
	{
		m_listAnimal = new ArrayList<Animal>();
	}
	
	public void addAnimal(Animal animal) 
	{
		m_listAnimal.add(animal);
	}
	
	public ArrayList<Animal> getListAnimal()
	{
		return m_listAnimal;
	}
	
	public ArrayList<Cry> getListCry()
	{
		ArrayList<Cry> cryList = new ArrayList<Cry>();
		
		for(int i=0; i < m_listAnimal.size(); i++)
		{
			cryList.add(m_listAnimal.get(i).crier());
		}
		
		return cryList;
	}
	
	public static void main(String[] args)
	{
		Zoo monZoo = new Zoo();
		
		monZoo.addAnimal(new Singe("Lucie",125));
		monZoo.addAnimal(new Singe("Simon",160));
		monZoo.addAnimal(new Chien("Clément",15));
		monZoo.addAnimal(new Chat("Dounia",6));
		monZoo.addAnimal(new Chien("toto",23));
		
		monZoo.getListCry();
	}
}
