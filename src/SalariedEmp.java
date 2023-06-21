public class SalariedEmp extends Employee{

    public int monthlySalary;

    public SalariedEmp(String name, int monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatorSalary() {
        return monthlySalary;
    }
}

