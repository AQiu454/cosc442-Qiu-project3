package edu.towson.cis.cosc442.project2.vendingmachine;

import org.junit.*;

import static org.junit.Assert.*;


public class VendingMachineExceptionTest {


		/**
		 * Run the VendingMachineException() constructor test.
		 *
		 * @throws Exception
		 *
		 */
		@Test
		public void testVendingMachineException_1()
			throws Exception {

			VendingMachineException result = new VendingMachineException();

			// add additional test code here
			assertNotNull(result);
			assertEquals(null, result.getCause());
			assertEquals("edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException", result.toString());
			assertEquals(null, result.getLocalizedMessage());
			assertEquals(null, result.getMessage());
		}

		/**
		 * Run the VendingMachineException(String) constructor test.
		 *
		 * @throws Exception
		 *
		  */
		@Test
		public void testVendingMachineException_2()
			throws Exception {
			String reason = "";

			VendingMachineException result = new VendingMachineException(reason);

			// add additional test code here
			assertNotNull(result);
			assertEquals(null, result.getCause());
			assertEquals("edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineException: ", result.toString());
			assertEquals("", result.getLocalizedMessage());
			assertEquals("", result.getMessage());
		}

		/**
		 * Perform pre-test initialization.
		 *
		 * @throws Exception
		 *         if the initialization fails for some reason
		 *
		 * 
		 */
		@Before
		public void setUp()
			throws Exception {
			// add additional set up code here
		}

		/**
		 * Perform post-test clean-up.
		 *
		 * @throws Exception
		 *         if the clean-up fails for some reason
		 *
		 */
		@After
		public void tearDown()
			throws Exception {
			// Add additional tear down code here
		}

		/**
		 * Launch the test.
		 *
		 * @param args the command line arguments
		 **/
		public static void main(String[] args) {
			new org.junit.runner.JUnitCore().run(VendingMachineExceptionTest.class);
		}
	}


