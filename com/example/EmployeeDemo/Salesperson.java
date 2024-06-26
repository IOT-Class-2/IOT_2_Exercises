package com.example.EmployeeDemo;

public class Salesperson extends Employee{  // 'public' Bu sınıfın her yerden erişilebilir olduğunu belirtir.
    // 'extends' Employee, Salesperson classını(sınıfının) Employee sınıfından miras aldığını belirtir.
    // 'Employee' sınıfından miras aldığını belirtir. Yani 'Salesperson' sınıfının tüm özelliklerine ve metotlarına sahip olur.

    private double commissionPercentage;

    public Salesperson(String name, double salary, int age,
                       double commissionPercentage) {
        super(name, salary, age);
        this.commissionPercentage = commissionPercentage;
    }

    public double getCommissionPercentage() {
        return this.commissionPercentage;
    }

    public void raiseCommission() {
        if (this.commissionPercentage < 0.30) { /* komisyon yüzdesi %30 dan küçükse %20 artır.
        Örnek: .25 ise bu değer %20 yani 1.2 ile çarpılıp toplandığında sonuç = 0.30 olur.*/
            this.commissionPercentage = this.commissionPercentage * 1.2;
        } else {
            System.out.println("Komisyon yüzdesi zaten %30 ya da daha yüksektir. Artırılamaz.");
        }
    }
}