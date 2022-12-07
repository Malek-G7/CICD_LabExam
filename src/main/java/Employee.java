
public class Employee {
    public String name;
    public String PPS ;

    public Employee(String name, String PPS) {
        setName(name);
        setPPS(PPS);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()<5 || name.length()>22){
            throw new IllegalArgumentException("Name provided is not valid");
        }
        else {
            this.name = name;
        }
    }

    public String getPPS() {
        return PPS;
    }

    public void setPPS(String PPS) {
        if(PPS.length()!=6){
            throw new IllegalArgumentException("PPS number provided is not valid");
        }
        else {
            this.PPS = PPS;
        }
    }
}
