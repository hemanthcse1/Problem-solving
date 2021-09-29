package ArrayListExamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Hemanth","Kumar",123));
        employeeList.add(new Employee("Anil","Arjun",456));
        employeeList.add(new Employee("Tejas","Kumar",124));
        employeeList.add(new Employee("Manusree","Raghava",154));


        employeeList.forEach(employee -> System.out.println(employee));


    }
}
