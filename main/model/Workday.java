package model;

import java.time.LocalTime;

public class Workday {
	
	private String day;
	private String workday;
	private double pay;
	
	public Workday(String day, String workday, double pay) {
		this.day = day;
		this.workday = workday;
		this.pay = pay;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public String getWorkday() {
		return workday;
	}

	public void setWorkday(String workday) {
		this.workday = workday;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
	
	

}
