package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineItemTest {
	
	VendingMachineItem item;
	final String ITEMNAME = "ItemName";
	final double ITEMPRICE = 1.5;
	
	//Setup test environment
	@Before
	public void setUp() throws Exception {
		item = new VendingMachineItem(ITEMNAME, ITEMPRICE);
	}

	//Test VendingMachineItem() constructor so passed values are assigned correctly
	@Test
	public void testVendingMachineItem() {
		item = new VendingMachineItem("Test name", 1);
		assertEquals("Test name", item.getName());
		assertEquals(1, item.getPrice(), .001);
	}
	
	@Test(expected = VendingMachineException.class)
	public void testVendingMachineItemNegativePrice() throws VendingMachineException {
		String name ="milk";
		double price = -1;
		VendingMachineItem result = new VendingMachineItem(name, price);
		assertNotNull(result);
	}

	//Test getName() so it returns the proper value
	@Test
	public void testGetName() {
		assertEquals(ITEMNAME, item.getName());
	}

	//Test getPrice()
	@Test
	public void testGetPrice() {
		assertEquals(ITEMPRICE, item.getPrice(), .001);
	}
}
