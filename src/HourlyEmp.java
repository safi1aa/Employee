public class HourlyEmp extends Employee{

    private int hoursNorked;
    private int hoursCyRace;


    public HourlyEmp(String name, int hoursNorked, int hoursCyRace) {
        super(name);
        this.hoursNorked = hoursNorked;
        this.hoursCyRace = hoursCyRace;

    }
    public double safia(){
        double sum = hoursNorked*hoursCyRace;
        return sum;
    }
}
