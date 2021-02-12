package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControllerFile {
	
	private String route;
	private File file;
    private FileReader fr = null;
    private BufferedReader br = null;
	
	public Map<String,Map<String,String>> obtainMap(){
		Map<String,Map<String,String>> mapResult = new HashMap<String,Map<String,String>>();
		try {
			file = new File("data.txt");
	         fr = new FileReader (file);
	         br = new BufferedReader(fr);
	         String line;
	         while((line=br.readLine())!=null) {
	        	 String[] result = line.split("=", 2); 
	        	 Map<String,String> hoursResult = obtainHours(result[1]);
	        	 mapResult.put(result[0], hoursResult);
	        	 //System.out.println(line);
	        	 //System.out.println(result[0]);
	        	 //System.out.println(result[1]);
	         }
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
		
		return mapResult; 
	}
	
	public Map<String,String> obtainHours(String statement){
		Map<String,String> hoursResult = new HashMap<String,String>();
		//System.out.println("I need obtain hours "+statement);
		String[] resultHours = statement.split(",", 6);
		for(int i = 0 ; i< resultHours.length ; i++) {
			//String chain = resultHours[i];
			String day = resultHours[i].substring(0,2);
			String hours=resultHours[i].substring(2);
			//System.out.println("this is my day "+day);
			//System.out.println("this is my hour "+hours);
			//hoursResult.add(resultHours[i]);
			hoursResult.put(day, hours);
			//System.out.println("this is my hours "+resultHours[i]);
		}
		return hoursResult;
	}

}
