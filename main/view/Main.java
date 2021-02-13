package view;


import java.util.Iterator;
import java.util.Map;
import controller.*;
import exceptions.EmptyDataException;
import java.util.Scanner;

public class Main {
	private static ControllerFile dataFile;
	private  static ControllerData dataEmployee;
	public static void main(String [] arg) {
		dataEmployee = new ControllerData();
		dataFile = new ControllerFile();
		System.out.println("-------------ACME Company-------------");
        
        boolean data = true;
        while(data) {
        	Scanner sc = new Scanner(System.in);
        	System.out.println("--------Welcome to ACME company--------");
        	System.out.println("1) Calculate pay for register employees");
        	System.out.println("2) Exit");
        	System.out.print("Choice a option: ");
        	int opt = sc.nextInt();
        	
        	if(opt == 1) {
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
        	}else if (opt==2) {
        		System.out.println("Thanks, return soon");
        		data=false;
        	}
        }
		System.exit(0);
		  
		}
	}

