
public class RetiredEmployee extends Employee {

	private double pension;

	// ����������� ������ RetiredEmployee �������� ��������,
	// ������������ � ������ �������� ��� ��������
	public RetiredEmployee(String name, double pension) {
		// ������� �������� ���� name ������ Employee
		super(name);
		// ��������� �������� ����� pension � ��������� ����������
		this.pension = pension;
	}

}
