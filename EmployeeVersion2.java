package EmployeeWageCalculator;

public class EmployeeVersion2 {
    private int baseSalary;
    private int hourlyRate;

    public EmployeeVersion2(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours){
        setExtraHours(extraHours);
        return(baseSalary + (hourlyRate*extraHours));
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Base salary cannot be 0 or negative");
        this.baseSalary = baseSalary;
    }
//    public int getBaseSalary(){
//        return baseSalary;
//    }

    private void setHourlyRate(int hourlyRate){
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or negative");
        this.hourlyRate = hourlyRate;
    }
//    public int getHourlyRate(){
//        return hourlyRate;
//    }

    private void setExtraHours(int extraHours){
        if(extraHours < 0)
            throw new IllegalArgumentException("Extra hours cannot be negative");
    }
}
