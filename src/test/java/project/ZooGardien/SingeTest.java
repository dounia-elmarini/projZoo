package project.ZooGardien;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SingeTest {
	
	private Singe singe;

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
		singe = new Singe("monkey", 85);
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	@Test
	public void test() 
	{
		Cry cry = new Cry("Hurler");
		assertEquals(singe.crier().toString(),cry.toString());
	}

}
