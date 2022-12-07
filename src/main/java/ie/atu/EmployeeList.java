package ie.atu;

import java.util.List;

public class EmployeeList {
    public static void main(String args[]){

    }
    private List<Employee> employees ;

    public EmployeeList() {
    }

    public EmployeeList(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public void addEmployee(Employee employee){
        for(Employee e : employees){
            if(e.getPPS() == employee.getPPS()){
                throw new IllegalArgumentException("Duplicate ie.atu.Employee details found, no object added");
            }
        }
        employees.add(employee);
    }
    public int getListSize(){
        return employees.size();
    }
}
