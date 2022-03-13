package lesson3;

public class Employee {

    String fio;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;


    Employee(String fio, String position, String email, String phoneNumber, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void employeeInfo (){
        System.out.printf("ФИО: %s\tДолжность: %s\t Email:%s\t Номер телефона: %s\t Зарплата: %d\t Возраста: %d\n" , fio, position, email, phoneNumber, salary, age);
    }
}