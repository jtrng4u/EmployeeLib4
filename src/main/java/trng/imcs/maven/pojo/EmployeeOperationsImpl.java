package trng.imcs.maven.pojo;

import java.util.List;

public class EmployeeOperationsImpl implements EmployeeOperations {

	List<Employee> employees;

	public EmployeeOperationsImpl() {
		employees.add(new Employee(123, "Raj"));
		employees.add(new Employee(124, "David"));
		employees.add(new Employee(125, "John"));
	}

	public Employee getEmployee(int empId) {
		return employees.get(0);
	}
}
