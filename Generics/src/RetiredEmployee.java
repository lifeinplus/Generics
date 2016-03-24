
public class RetiredEmployee extends Employee {

	private double pension;

	// Конструктор класса RetiredEmployee получает значения,
	// передаваемые в момент создания его объектов
	public RetiredEmployee(String name, double pension) {
		// Передаём значение поля name классу Employee
		super(name);
		// Сохраняем значение полня pension в локальной переменной
		this.pension = pension;
	}

}
