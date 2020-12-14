/**
 * created with Intellij IDEA
 * user: Administrator
 * date: 2020/12/11
 * time: 16:25
 * to change this template use file | settings| Editor | file and code Templates | includes | file header .
 */
public class Employee {
    private String empName;
    private double wage;

    public Employee(String s, double v) {
        this.empName= s;
        this.wage= v;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }
}
