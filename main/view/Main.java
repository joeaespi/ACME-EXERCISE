package view;


import java.util.Iterator;
import java.util.Map;
import controller.*;
import exceptions.EmptyDataException;

public class Main {
	private static ControllerFile dataFile;
	private  static ControllerData dataEmployee;
	public static void main(String [] arg) {
		dataEmployee = new ControllerData();
		dataFile = new ControllerFile();
		  try {
			  dataEmployee = new ControllerData();
				Map<String,Map<String,String>> input = dataFile.obtainMap();
				Iterator it = input.keySet().iterator();
				while(it.hasNext()){
				  String key = (String) it.next();
				  dataEmployee.pay(key, input.get(key));
				}
		  } catch (EmptyDataException e) {
			  System.out.println(e.getMessage());
		  }
		}
	}

