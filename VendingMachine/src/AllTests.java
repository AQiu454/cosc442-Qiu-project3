import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineItemTest;
import edu.towson.cis.cosc442.project2.vendingmachine.VendingMachineTest;


@RunWith(Suite.class)
@SuiteClasses({VendingMachineItemTest.class, VendingMachineTest.class})
public class AllTests {

}
