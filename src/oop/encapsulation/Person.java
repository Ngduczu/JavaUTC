package oop.encapsulation;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

import oop.Gender;

public abstract class Person {
    private String id;
    private String fullName;
    private Gender gender;
    private LocalDate dayOfBirth;

    // Support Function
    private Gender parseGender(String gender){
        if(gender == null) return null;
        String g = gender.toLowerCase();

        if(g.equals("nam")) return Gender.MALE;
        if(g.equals("nữ")) return Gender.FEMALE;

        return null;
    }
    private static final List<String> FORMATS = List.of(
            "dd/MM/yyyy",
            "dd-MM-yyyy",
            "yyyy-MM-dd",
            "yyyy/MM/dd"
        );
    private LocalDate parseLocalDate(String date){
        if (date == null) return null;
        for(String format : FORMATS){
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
                return LocalDate.parse(date, formatter);
            } catch (Exception ignored) {}
        }
        return null;
    }


    // Constructor
    public Person(){}

    public Person(String id, String fullName,String gender, String dayOfBirth){
        this.id = id;
        this.fullName = fullName;
        this.gender = parseGender(gender);
        this.dayOfBirth = parseLocalDate(dayOfBirth);
    }

    // Getter
    public String getId(){ return id; }
    public String getFullName() { return fullName; }
    public LocalDate getDayOfBirth() { return dayOfBirth; }
    public String getDayOfBirthText() { return (dayOfBirth != null) ? dayOfBirth.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) : ""; }
    public Gender getGender() { return gender; }
    public String getGenderText() { return (gender != null) ? gender.getText() : "Undefined"; }
    public String getRole() { return null; }
    public int getAge(){
        if(dayOfBirth == null) return 0;
        return Period.between(dayOfBirth, LocalDate.now()).getYears();
    }

    // Setter
    public void setId(String id){ this.id = id; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setDayOfBirth(LocalDate dayOfBirth) { this.dayOfBirth = dayOfBirth; }

    @Override
    public String toString(){
        return "Person { id : " + id + "; fullName : " + fullName + "; gender : " + getGenderText() + "; dayOfBirth : " + getDayOfBirthText() + "; age :" + getAge() + " }";
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(fullName, person.fullName) && gender == person.gender && Objects.equals(dayOfBirth, person.dayOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, gender, dayOfBirth);
    }
    
// method
}
