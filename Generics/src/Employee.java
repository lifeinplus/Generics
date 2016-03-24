
public class Employee {

	private String name;

	//  онструктор класса Employee получает значение,
	// передаваемое классом RetiredEmployee
	// в момент создани€ его объектов
	public Employee(String name) {
		// —охран€ем значение полн€ name в локальной переменной
		this.name = name;
	}

	// ƒанный метод возвращает значение пол€ name
	public String getName() {
		return name;
	}

}
