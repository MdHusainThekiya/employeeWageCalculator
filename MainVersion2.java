package EmployeeWageCalculator;

public class MainVersion2 {
    public static void main(String[] args){
        var husian = new EmployeeVersion2(50_000, 20);
        int employeeWage = husian.calculateWage(-1);
        System.out.println(employeeWage);
    }
}
