package TreeSet;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	int salary;
	public Employee() {
			}
	public Employee(String name,int id, int salary) {
		super();
		this.id = id;
		this.name = name;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		int x = this.name.compareTo(e.name);
		return x;
	}
	
	
	

}
