package project.ZooGardien;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ChatTest {
	
	private Chat chat;
	
	@BeforeClass // avant tout
    public static void setUpBeforeClass() 
    {
    	System.out.println("Début des tests !");
    }
	    
    @AfterClass // aprés tout
    public static void tearDownAfterClass() 
    {
    	System.out.println("Fin des tests !");
    }

	@Before
	public void setUp() throws Exception 
	{
		chat = new Chat("Jack", 25);
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	public void testCrier() 
	{
		Cry cry = new Cry("Miauler");
		assertEquals(chat.crier().toString(),cry.toString());
	}	
}
