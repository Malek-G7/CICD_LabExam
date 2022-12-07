package ie.atu;

import ie.atu.Employee;
import ie.atu.EmployeeList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeListTest {
    @Test
    public void addEmployeeTestSuccess(){
        List<Employee> list = new ArrayList<>();
        EmployeeList employeeList = new EmployeeList(list);
        Employee employee1 = new Employee("MALEK_1","123456");
        Employee employee2 = new Employee("MALEK_2","123457");
        employeeList.addEmployee(employee1);
        employeeList.addEmployee(employee2);
        assertEquals(2,employeeList.getListSize());
    }
    @Test
    public void addEmployeeTestFail(){
        List<Employee> list = new ArrayList<>();
        EmployeeList employeeList = new EmployeeList(list);
        Employee employee1 = new Employee("MALEK_1","123456");
        Employee employee2 = new Employee("MALEK_2","123456");
        employeeList.addEmployee(employee1);
        Exception exception = assertThrows(IllegalArgumentException.class,() ->{employeeList.addEmployee(employee2);});
        assertEquals("Duplicate ie.atu.Employee details found, no object added",exception.getMessage());
    }

    @Test
    public void getSizeTest(){
        List<Employee> list = new ArrayList<>();
        EmployeeList employeeList = new EmployeeList(list);
        Employee employee1 = new Employee("MALEK_1","123456");
        Employee employee2 = new Employee("MALEK_2","123457");
        Employee employee3 = new Employee("MALEK_2","123458");
        employeeList.addEmployee(employee1);
        employeeList.addEmployee(employee2);
        employeeList.addEmployee(employee3);
        assertEquals(3,employeeList.getListSize());
    }
}
