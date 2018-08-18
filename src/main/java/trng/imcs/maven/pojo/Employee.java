package trng.imcs.maven.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Employee {

	private int empNo;
	private String name;

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + "]";
	}

}
