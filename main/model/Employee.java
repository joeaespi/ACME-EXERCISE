package model;

public class Employee {
	
	private String name;
	private double salary; 
	
	public Employee(String name) {
		super();
		this.name = name;
		this.salary = 0.0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void calculateSalary(String name, float salary) {
		if(name == this.name) {
			this.salary+=salary;
		}
	}

	@Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Employee guest = (Employee) obj;
        return (name == guest.name || (name != null && name.equals(guest.getName())));
    }
}
