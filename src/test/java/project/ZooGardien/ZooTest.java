package project.ZooGardien;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ZooTest {
	
	private Zoo zoo;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
	}

	@Before
	public void setUp() throws Exception 
	{
		zoo = new Zoo();
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	public void testAddAnimal() 
	{
		Singe singe = new Singe("Monkey", 68);
		
		zoo.addAnimal(singe);
		
		assertEquals(zoo.getListAnimal().get(0), singe);
	}

}
