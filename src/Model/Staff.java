package Model;

public class Staff {
    private int id;
    private String name;
    private String dayOfBirth;
    private String workingPosition;
    private double workingTime;
    private double ratesSalary;

    public Staff() {
    }

    public Staff(String name, String dayOfBirth, String workingPosition, double workingTime, double ratesSalary) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.workingPosition = workingPosition;
        this.workingTime = workingTime;
        this.ratesSalary = ratesSalary;
    }

    public void setId(int id) {
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getWorkingPosition() {
        return workingPosition;
    }

    public void setWorkingPosition(String workingPosition) {
        this.workingPosition = workingPosition;
    }

    public double getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(double workingTime) {
        this.workingTime = workingTime;
    }

    public double getRatesSalary() {
        return ratesSalary;
    }

    public void setRatesSalary(double ratesSalary) {
        this.ratesSalary = ratesSalary;
    }

    public void showInfo(){
        System.out.printf("  %-5d",getId());
        System.out.format("  %-20s ",getName());
        System.out.printf("  %-15s ",getDayOfBirth());
        System.out.printf("  %-15s%n",getWorkingPosition());
    }

}
