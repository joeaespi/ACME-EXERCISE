package controller;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import model.*;

public class ControllerData {
	
	private ArrayList<Employee> employees = new ArrayList<Employee>();
	private ArrayList<Workday> workdays = new ArrayList<Workday>();
	
	public ControllerData() {
		this.employees.add(new Employee("Rene"));
		this.employees.add(new Employee("Lenin"));
		this.employees.add(new Employee("Joel"));
		this.employees.add(new Employee("Juan"));
		this.employees.add(new Employee("Astrid"));
		this.workdays.add(new Workday("MO","00:01-09:00",25.0));
		this.workdays.add(new Workday("TU","00:01-09:00",25.0));
		this.workdays.add(new Workday("WE","00:01-09:00",25.0));
		this.workdays.add(new Workday("TH","00:01-09:00",25.0));
		this.workdays.add(new Workday("FR","00:01-09:00",25.0));
		this.workdays.add(new Workday("SA","00:01-09:00",30.0));
		this.workdays.add(new Workday("SU","00:01-09:00",30.0));
		this.workdays.add(new Workday("MO","09:01-18:00",15.0));
		this.workdays.add(new Workday("TU","09:01-18:00",15.0));
		this.workdays.add(new Workday("WE","09:01-18:00",15.0));
		this.workdays.add(new Workday("TH","09:01-18:00",15.0));
		this.workdays.add(new Workday("FR","09:01-18:00",15.0));
		this.workdays.add(new Workday("SA","09:01-18:00",20.0));
		this.workdays.add(new Workday("SU","09:01-18:00",20.0));
		this.workdays.add(new Workday("MO","18:01-00:00",20.0));
		this.workdays.add(new Workday("TU","18:01-00:00",20.0));
		this.workdays.add(new Workday("WE","18:01-00:00",20.0));
		this.workdays.add(new Workday("TH","18:01-00:00",20.0));
		this.workdays.add(new Workday("FR","18:01-00:00",20.0));
		this.workdays.add(new Workday("SA","18:01-00:00",25.0));
		this.workdays.add(new Workday("SU","18:01-00:00",25.0));
	}
	public void pay(String name, Map<String,String> data) {
		int i = 0, j = employees.size();
		
		if(i<j && i != employees.size()-1) {
			Employee employeInitial = employees.get(i);
			Employee employeFinal = employees.get(j-1);
			if(!employeInitial.equals(employeFinal)) {
				//System.out.println("Son diferentes");
				if(employeInitial.getName().equalsIgnoreCase(name)) {
					System.out.println("EmployeeI "+ name);
					System.out.println("el primero son igual");
					double v = this.validateWorkday(data, workdays);
					System.out.println(v);
				}else if (employeFinal.getName().equalsIgnoreCase(name)) {
					System.out.println("EmployeeF "+ name);
					double v = this.validateWorkday(data, workdays);
					System.out.println("el ultimo es igual");
					System.out.println(v);
				}
			}else {
				if(employeInitial.getName().equalsIgnoreCase(name)) {
					System.out.println("EmployeeD "+ name);
					double v = this.validateWorkday(data, workdays);
					System.out.println("Son iguales");
					System.out.println(v);
				}
			}
			i++;
			j--;
		}
	}
	
	private double validateWorkday(Map<String,String> data,ArrayList<Workday> workdaysData) {
		double valor = 0.0;
		Iterator it = data.keySet().iterator();
		while(it.hasNext()){
		  String key = (String) it.next();
		  System.out.println("Clave: " + key + " -> Valor: " + data.get(key));
		  valor += obtainPay(workdaysData,key,data.get(key));
		}
		return valor;
	}
	
	private double obtainPay(ArrayList<Workday> workdaysData, String day,String work) {
		double pay = 0.0;
		for(int i = 0; i< workdaysData.size()-1;i++) {
			workdaysData.get(i).getDay();
			workdaysData.get(i).getWorkday();
			if(workdaysData.get(i).getDay().equalsIgnoreCase(day) ) {
				if(workdaysData.get(i).getWorkday().equalsIgnoreCase(work)) {
					System.out.println("work:"+workdaysData.get(i).getWorkday()+" pay: "+workdaysData.get(i).getPay());
					pay +=workdaysData.get(i).getPay();
				}
			}
		}
		System.out.println("final pay: "+pay);
		return pay;
	}

	

}
