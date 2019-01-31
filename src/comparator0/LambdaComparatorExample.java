package comparator0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Jose R F Junior
 * web2ajax@gmail.com
 */
public class LambdaComparatorExample {
    public static void main(String[] args) {

        List<Employee> employeeList1 = getEmployees();
        System.out.println("--Before sorting list-- \n" + employeeList1);

        // Anonymous class (Old way)
        Comparator<Employee> comparator1 = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));
            }
        };

        // Sort employee list
        Collections.sort(employeeList1, comparator1);
        System.out.println("--After sorting list using anonymous class--");
        System.out.println(employeeList1);

        List<Employee> employeeList2 = getEmployees();
        // Lambda expression
        Comparator<Employee> comparator2 = (o1, o2) -> {
            return new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));
        };
        // Sort employee list
        Collections.sort(employeeList2, comparator2);
        System.out.println("--After sorting list using Lambda expression--");
        System.out.println(employeeList2);
    }

    private static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(5, "Maria", 28));
        employees.add(new Employee(8, "Joao", 35));
        employees.add(new Employee(10, "Jose", 40));
        employees.add(new Employee(2, "Junior", 25));
        employees.add(new Employee(4, "Herick", 22));
        return employees;
    }
}