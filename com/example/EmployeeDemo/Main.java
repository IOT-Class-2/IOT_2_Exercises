package com.example.EmployeeDemo;

public class Main {
    public static void main(String[] args){
        Engineer employeeOne = new Engineer("Sally Roberts", 80000, 34);

        Salesperson employeeTwo = new Salesperson("Matt Johnson", 65000, 32, .25);

        employeeOne.getAnnualBonus();
        employeeTwo.raiseSalary();
        employeeTwo.getCommissionPercentage();
        employeeTwo.raiseCommission(); // Call the raiseCommission method

        System.out.println("Employee One Salary: " + employeeOne.salary);
        System.out.println("Employee One Annual Bonus: " + employeeOne.getAnnualBonus());
        System.out.println("Employee Two Salary: " + employeeTwo.salary);
        System.out.println("Employee Two Commission Percentage: " + employeeTwo.getCommissionPercentage());

    }
}
