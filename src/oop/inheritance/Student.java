package oop.inheritance;

import oop.encapsulation.*;
public class Student extends Person{
    private String studentCode;

    // Constructor
    public Student(){
        super();
    }

    public Student(String id, String studentCode ,String fullName, String gender, String dayOfBirth ){
        super(id, fullName, gender,dayOfBirth);
        this.studentCode = studentCode;
    }

    // getter
    public String getStudentCode(){ return studentCode; }

    @Override
    public String getRole() { return "Học sinh";}

    // setter
    public void setStudentCode(String studentCode){
        this.studentCode = studentCode;
    }

    // method
    @Override
    public String toString(){
        return "Student { id : " + getId() + "; studentCode : " + studentCode + "; fullName : " + getFullName() + "; gender : " + getGenderText() + "; dayOfBirth : " + getDayOfBirthText() + "; age :" + getAge() + " }";
    }
}
