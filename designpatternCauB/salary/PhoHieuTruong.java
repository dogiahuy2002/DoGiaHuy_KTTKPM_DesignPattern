package designpatternCauB.salary;

public class PhoHieuTruong extends SalaryDecorator {

    public PhoHieuTruong(Employee employee) {
        super(employee);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return super.getDescription() + "PHT";
    }

    @Override
    public double getSalary() {
        // TODO Auto-generated method stub
        return super.getSalary() + 8000;
    }

}
