import java.util.LinkedList;

public class TestGenericMethod {

	public static void main(String[] args) {
		// ������ ��������� ���� RetiredEmployee
		LinkedList<RetiredEmployee> retiredEmployees = new LinkedList<>();
		
		// ������ ������� ���� RetiredEmployee
		// � ������� �������� � �� ������������
		// ��������� ��������� ������� � �������������� ���������
		retiredEmployees.add(new RetiredEmployee("Mark Smith", 123000.0));
		retiredEmployees.add(new RetiredEmployee("John McCalahan", 175000.0));
		retiredEmployees.add(new RetiredEmployee("Patric Stuart", 158000.0));
		
		// ������� ������ copyEmployees ��������� �������� retiredEmployees
		// �������� ��������� �������� ���� Employee �� ���������� �����
		// ��� � �������� ��������� ���� RetiredEmployee
		LinkedList<Employee> employees = TestGenericMethod.copyEmployees(retiredEmployees);
		
		System.out.println("Clonned employees:");
		
		// ��� �� �������� ��������� employees
		for (Employee employee : employees) {
			// ������� �� ������� �������� ����� name �������� ���������
			System.out.println(employee.getName());
		}
	}

	// �������� ��������� ��������,
	// ��� ������� �������� ����������� ���� Employee
	private static LinkedList<Employee> copyEmployees(LinkedList<? extends Employee> retiredEmployees) {
		// ������ ��������� ���� Employee
		LinkedList<Employee> employees = new LinkedList<>();
		
		// ��� �� �������� ��������� retiredEmployee
		for (Employee employee : retiredEmployees) {
			// ������ ������ ���� Employee � ������� ��� ������������
			// �������� ����� name �������� ������� RetiredEmployee
			// ��������� ��������� ������ � ��������� ���� Employee
			employees.add(new Employee(employee.getName()));
		}
		
		// ���������� ��������� �������� ���� Employee
		return employees;
	}

}
