
public class Main {
    public static void main(String[] args) {


        HourlyEmp hourlyEmp = new HourlyEmp("safia", 18, 16);
        SalariedEmp salariedEmp = new SalariedEmp("safia", 30000);
        double fatima = hourlyEmp.safia();
        double cat = salariedEmp.calculatorSalary();
        System.out.println(fatima);
        System.out.println(cat);

    }
}