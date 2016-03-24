import java.util.LinkedList;

public class TestGenericMethod {

	public static void main(String[] args) {
		// Создаём коллекцию типа RetiredEmployee
		LinkedList<RetiredEmployee> retiredEmployees = new LinkedList<>();
		
		// Создаём объекты типа RetiredEmployee
		// и передаём значения в их конструкторы
		// Добавляем созданные объекты в подготовленную коллекцию
		retiredEmployees.add(new RetiredEmployee("Mark Smith", 123000.0));
		retiredEmployees.add(new RetiredEmployee("John McCalahan", 175000.0));
		retiredEmployees.add(new RetiredEmployee("Patric Stuart", 158000.0));
		
		// Передаём методу copyEmployees коллекцию объектов retiredEmployees
		// Получаем коллекцию объектов типа Employee со значениями полей
		// как в объектах коллекции типа RetiredEmployee
		LinkedList<Employee> employees = TestGenericMethod.copyEmployees(retiredEmployees);
		
		System.out.println("Clonned employees:");
		
		// Идём по объектам коллекции employees
		for (Employee employee : employees) {
			// Выводим на консоль значения полей name объектов коллекции
			System.out.println(employee.getName());
		}
	}

	// Получаем коллекцию объектов,
	// тип которой является наследником типа Employee
	private static LinkedList<Employee> copyEmployees(LinkedList<? extends Employee> retiredEmployees) {
		// Создаём коллекцию типа Employee
		LinkedList<Employee> employees = new LinkedList<>();
		
		// Идём по объектам коллекции retiredEmployee
		for (Employee employee : retiredEmployees) {
			// Создаём объект типа Employee и передаём его конструктору
			// значение полня name текущего объекта RetiredEmployee
			// Добавляем созданный объект в коллекцию типа Employee
			employees.add(new Employee(employee.getName()));
		}
		
		// Возвращаем коллекцию объектов типа Employee
		return employees;
	}

}
