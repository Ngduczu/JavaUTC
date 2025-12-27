package oop;

import oop.encapsulation.*;
import oop.inheritance.*;;

public class Main {
    public static void main(String[] args) {
        Person person = new Student("044206001539", "241230896", "Nguyễn Đức Vũ", "Nam", "12-08-2006");
        System.out.println(person.toString());
    }
}
