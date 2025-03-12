package designpatternCauB.salary;

public class TruongPhong extends SalaryDecorator {
    // Dùng Decorator Pattern cho bài toán này

    public TruongPhong(Employee employee) {
        super(employee);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return super.getDescription() + "TP";
    }

    @Override
    public double getSalary() {
        // TODO Auto-generated method stub
        return super.getSalary() + 3000;
    }

}
