package designpatternCauB.salary;

public class HieuTruong extends SalaryDecorator {

    public HieuTruong(Employee employee) {
        super(employee);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return super.getDescription() + "HT";
    }

    @Override
    public double getSalary() {
        // TODO Auto-generated method stub
        return super.getSalary() + 10000;
    }
}
