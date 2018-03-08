package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	VendingMachine vendor;
	VendingMachineItem item;

	// Setup the testing environment
	@Before
	public void setUp() throws Exception {
		vendor = new VendingMachine();
		item = new VendingMachineItem("TestItem", 1);
	}

	// Test addItem() and make sure it is in the Vending Machine
	@Test
	public void testAddItem() {
		vendor.addItem(item, "A");
		assertEquals(item, vendor.getItem("A"));
	}

	@Test(expected = VendingMachineException.class)
	public void testAddItemAlreadyOccupied() {
		vendor.addItem(item, "B");
	}

	// Make sure that items can be removed
	@Test
	public void testRemoveItem() {
		int i=0;
		vendor.addItem(item, "C");
		while (i!=2) {
		if (item == vendor.getItem("C")) {
			assertEquals(item, vendor.removeItem("C"));
			i++;
		vendor.addItem(item,"D");
		}
		else {
			System.out.println("Item was not added, could not be removed");
			i++;
		}
	}
}


	// Test removing an item from an empty slot
	@Test(expected = VendingMachineException.class)
	public void testRemoveItemNullItem() {
		vendor.addItem(item, "A");
		vendor.removeItem("A");
	}


	// Make sure getBalance() is returning the accurate value
	@Test
	public void testGetBalance() {
		assertEquals(vendor.balance, vendor.getBalance(), .001);
	}

	// Test that items can be purchased with makePurchase()
	@Test
	public void testMakePurchase() {
		vendor.addItem(item, "D");
			vendor.insertMoney(1);
			assertTrue(vendor.makePurchase("D"));
	}


	@Test
	public void testMakePurchaseNullItem() {
		assertFalse(vendor.makePurchase("A"));
	}

	// Test insertMoney()
	@Test
	public void testInsertMoney() {
		vendor.insertMoney(1);
		assertEquals(1, vendor.balance, .001);
	}


	// Test that returnChange() returns the proper change value
	@Test
	public void testReturnChange() {
		vendor.insertMoney(.5);
		assertEquals(.5, vendor.returnChange(), .001);
	}

	//Test GetSlortsIndex for 5 codes
	@Test
	public void testGetSlotIndex_1()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "A";

		int result = fixture.getSlotIndex(code);

		// add additional test code here
		assertEquals(0, result);
	}


	@Test
	public void testGetSlotIndex_2()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "B";

		int result = fixture.getSlotIndex(code);

		// add additional test code here
		assertEquals(1, result);
	}


	@Test
	public void testGetSlotIndex_3()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "C";

		int result = fixture.getSlotIndex(code);

		// add additional test code here
		assertEquals(2, result);
	}


	@Test
	public void testGetSlotIndex_4()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "D";

		int result = fixture.getSlotIndex(code);

		// add additional test code here
		assertEquals(3, result);
	}


	@Test(expected = edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException.class)
	public void testGetSlotIndex_5()
		throws Exception {
		VendingMachine fixture = new VendingMachine();
		fixture.balance = 1.0;
		String code = "";

	}
	
	
	
}
