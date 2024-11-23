package hibernate_kapil.entity;

public class Kapil_Employee {

	private int id;
	private String name;
	private String gender;
	private int salary;
	
	public Kapil_Employee() {
		super();
	}
	
	
	public Kapil_Employee( String name, String gender, int salary) {
//		super();
		
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Kapil_Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
	
	

}