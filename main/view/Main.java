package view;

import java.util.Iterator;
import java.util.Map;

import controller.*;

public class Main {
	private static ControllerFile dataFile;
	private  static ControllerData dataEmployee;
	public static void main(String [] arg) {
		dataEmployee = new ControllerData();
		dataFile = new ControllerFile();
		dataEmployee = new ControllerData();
		Map<String,Map<String,String>> input = dataFile.obtainMap();
		Iterator it = input.keySet().iterator();
		while(it.hasNext()){
		  String key = (String) it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + input.get(key));
		  dataEmployee.pay(key, input.get(key));
		}
	}
}
