package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import exceptions.EmptyDataException;
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
	
	
	public void pay(String name, Map<String,String> data) throws EmptyDataException {
		int i = 0, j = employees.size()-1;
		if(j>0) {
			while(i<=j ) {
				Employee employeInitial = employees.get(i);
				Employee employeFinal = employees.get(j);
				if(!employeInitial.equals(employeFinal)) {
					if(employeInitial.getName().equalsIgnoreCase(name)) {
						double value = this.validateWorkday(data, workdays);
						employeInitial.setSalary(value);
						System.out.println("The amount to pay "+name+" is: "+employeInitial.getSalary()+" USD");
						i++;
					}else if (employeFinal.getName().equalsIgnoreCase(name)) {
						double value = this.validateWorkday(data, workdays);
						employeFinal.setSalary(value);
						System.out.println("The amount to pay "+name+" is: "+employeFinal.getSalary()+" USD");
						j--;
					}
				}else {
					if(employeInitial.getName().equalsIgnoreCase(name)) {
						double value = this.validateWorkday(data, workdays);
						employeInitial.setSalary(value);
						System.out.println("The amount to pay "+name+" is: "+employeInitial.getSalary()+" USD");
					}
				}
				i++;
				j--;
			}
		}else {
			throw new EmptyDataException("Don't exist employees register");
		}
	}
	
	private double validateWorkday(Map<String,String> data,ArrayList<Workday> workdaysData) throws EmptyDataException {
		double value = 0.0;
		Iterator it = data.keySet().iterator();
		while(it.hasNext()){
		  String key = (String) it.next();
		  value += obtainPay(workdaysData,key,data.get(key));
		}
		return value;
	}
	
	private double obtainPay(ArrayList<Workday> workdaysData, String day,String work) throws EmptyDataException {
		double pay = 0.0;
		if(workdaysData.size()<=0) {
			throw new EmptyDataException("Don't exist workdays registered");
		}
		for(int i = 0; i< workdaysData.size();i++) {
			workdaysData.get(i).getDay();
			workdaysData.get(i).getWorkday();
			if(workdaysData.get(i).getDay().equalsIgnoreCase(day) ) {
				if(workdaysData.get(i).getWorkday().equalsIgnoreCase(work)) {
					pay +=workdaysData.get(i).getPay();
				}
			}
		}
		return pay;
	}
}
