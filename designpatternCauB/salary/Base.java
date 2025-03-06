package designpatternCauB.salary;

public class Base implements Employee {

    private double baseSalary;

    public Base(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }

    @Override
    public String getDescription() {
        return "Nhân viên";
    }

}
