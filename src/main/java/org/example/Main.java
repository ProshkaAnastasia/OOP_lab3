package org.example;

import management.*;

import management.Currency;


public class Main {
    public static void main(String[] args) {
        System.out.println();
        Currency c = new Currency(400, 0);
        Enterpreneur e = new Enterpreneur(c);
        StaffManager manager = new StaffManager(e);
        SalaryManager m = new SalaryManager(e);
        Worker w1 = new Worker("Ann", 53, 39);
        Worker.addWorker(w1);
        manager.hire(w1);
        m.changeSalary(w1, new Salary(), 8, 5);
        m.paySalary(w1);
        return;
    }
}