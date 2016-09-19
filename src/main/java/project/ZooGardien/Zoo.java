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
	
	public ArrayList<Cry> getListCry()
	{
		ArrayList<Cry> cryList = new ArrayList<Cry>();
		
		for(int i=0; i < m_listAnimal.size(); i++)
		{
			cryList.add(m_listAnimal.get(i).crier());
		}
		
		return cryList;
	}
}
