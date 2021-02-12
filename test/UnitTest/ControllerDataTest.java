package UnitTest;

import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import controller.ControllerData;
import exceptions.EmptyDataException;



class ControllerDataTest {
	private  static ControllerData dataEmployee = new ControllerData();
	Map<String,String> hours = new HashMap<String,String>();

	@Before
	public void data() {
		  hours.put("MO", "09:01-18:00");
		  hours.put("WE", "09:01-18:00");
		  hours.put("FR", "09:01-18:00");
		  hours.put("SA", "00:01-09:00");
		  hours.put("SU", "18:01-00:00");
	}
	
	@Test
	public void payTest() {
		try {
			dataEmployee.pay("CARLOS", hours);
			assertTrue("Exist employees register", true);
		} catch (EmptyDataException e) {
			System.out.println(e.getMessage());
			assertTrue("Exist empty data", false);
		}
	}

}
