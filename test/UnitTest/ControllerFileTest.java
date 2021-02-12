package UnitTest;

import static org.junit.Assert.assertEquals;
import java.util.Map;
import org.junit.jupiter.api.Test;
import controller.ControllerFile;

class ControllerFileTest {
	private static ControllerFile dataFile = new ControllerFile();
	Map<String,Map<String,String>> data;
	
	@Test
	public void obtainMapTest() {
		data = dataFile.obtainMap();
		assertEquals("We obtained the information of file", data.isEmpty(),false);
	}
	

}
