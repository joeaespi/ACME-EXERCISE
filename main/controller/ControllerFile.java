package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
	         }
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e){ 
	        	 System.out.println(e.getMessage());
	         }
	      }
		
		return mapResult; 
	}
	
	private Map<String,String> obtainHours(String statement){
		Map<String,String> hoursResult = new HashMap<String,String>();
		String[] resultHours = statement.split(",", 6);
		for(int i = 0 ; i< resultHours.length ; i++) {
			String day = resultHours[i].substring(0,2);
			String hours=resultHours[i].substring(2);
			hoursResult.put(day, hours);
		}
		return hoursResult;
	}

}
