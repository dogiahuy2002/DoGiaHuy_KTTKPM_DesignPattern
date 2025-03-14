package designpatternCauB.salary;

//decorator chung cho các loại phụ cấp
public class SalaryDecorator implements Employee {
    // Dùng Decorator Pattern cho bài toán này

    protected Employee employee;

    public SalaryDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public double getSalary() {
        return employee.getSalary();
    }

    @Override
    public String getDescription() {
        return employee.getDescription();
    }

}
