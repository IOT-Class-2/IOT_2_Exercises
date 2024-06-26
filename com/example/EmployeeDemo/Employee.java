package com.example.EmployeeDemo;

public class Employee { // 'public' Bu sınıfın her yerden erişilebilir olduğunu belirtir.

    // Çalışanın adını tutan bir metin değişkenidir.
    private String name; // 'private' Bu değişkenin sadece bu sınıfın içinden erişilebilir olduğunu belirtir.

    // Çalışanın maaşını tutan ondalıklı sayı değişkeni
    protected double salary; // Bu değişkene aynı paket içerisinden veya alt sınıflardan erişilebilir.

    // Çalışanın yaşını tutan tam sayı değişkeni.
    private int age; // 'private' Bu değişkenin sadece bu sınıfın içinden erişilebilir olduğunu belirtir.

    public Employee(String name, double salary, int age) { // Bu sınıfın bir örneği oluşturulurken çağırılan metottur.
        this.name = name; // "name" parametresini sınıfın 'name' değişkenine atar.
        this.salary = salary; // "salary" parametresini sınıfın 'salary' değişkenine atar.
        this.age = age; // "age" parametresini sınıfın 'age' değişkenine atar.
    }

    // Getter ve Setter metotları:
    // Bu metodlar, özel değişkenlerin değerlerini dış dünyaya(başka sınıflara yani) vermek için kullanılır.
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary() { // Çalışanın maaşını artıran metot.
        this.salary = this.salary * 1.2; // %20 değerinde maaşı artırır.
    }
}
