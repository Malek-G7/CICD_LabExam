package ie.atu;

import ie.atu.Employee;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    public void testConstructorSuccess(){
        Employee employee = new Employee("MALEK_GESHASH","123456");
        assertEquals("MALEK_GESHASH",employee.getName());
        assertEquals("123456",employee.getPPS());
    }
    @Test
    public void testConstructorFailureName(){
        Exception exception = assertThrows(IllegalArgumentException.class,() ->{new Employee("m","123456");});
        assertEquals("Name provided is not valid",exception.getMessage());

    }
    @Test
    public void testConstructorFailurePPS(){
        Exception exception = assertThrows(IllegalArgumentException.class,() ->{new Employee("MALEK_GESHASH","123");});
        assertEquals("PPS number provided is not valid",exception.getMessage());
    }
}
