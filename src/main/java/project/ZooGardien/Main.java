package project.ZooGardien;

public class Main {
	
	public static void main(String[] args)
	{
		Zoo monZoo = new Zoo();
		
		monZoo.addAnimal(new Singe("Lucie",125));
		monZoo.addAnimal(new Singe("Simon",160));
		monZoo.addAnimal(new Chien("Clément",15));
		monZoo.addAnimal(new Chat("Dounia",6));
		monZoo.addAnimal(new Chien("Patinaud",25));
		monZoo.addAnimal(new Chien("toto",23));
		
		monZoo.getListCry();
	}
}
