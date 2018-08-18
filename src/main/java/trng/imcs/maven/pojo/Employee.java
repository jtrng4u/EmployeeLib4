package trng.imcs.maven.pojo;

public class Employee {

	private int empNo;
	private String name;

	public Employee(int empNo, String name) {
		super();
		this.empNo = empNo;
		this.name = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + "]";
	}

}
