# Java - OOP - Interface

## Mục lục
1. [**OOP là gì?**](#oop-là-gì)
2. [**Class và Object**](#class-và-object)
3. [**Thuộc tính và Phương thức**](#thuộc-tính-và-phương-thức)
4. [**Constructor**](#constructor)
5. [**Các tính chất của OOP**](#)
    - [**Encapsulation (Đóng gói)**](#encapsulation---đóng-gói)
        - [**Access Modifier (Phạm vi truy cập)**](#access-modifier-phạm-vi-truy-cập)
    - [**Inheritance (Kế thừa)**](#inheritance---kế-thừa)
    - [**Polymorphism (Đa hình)**](#polymorphism-đa-hình)
    - [**Abstraction (Trừu tượng)**](#abstraction-trừu-tượng)
6. [**Interface trong Java**](#interface-trong-java)
7. [**Abstract Class vs Interface**](#abstract-class-vs-interface)
8. [**Static trong OOP**](#static-trong-oop)
---

## OOP là gì?
**OOP (Object-Oriented Programming)** là phương pháp lập trình dựa trên **đối tượng**, giúp:
- Dễ bảo trì
- Dễ mở rộng
- Code rõ ràng, logic

Java là ngôn ngữ **thuần OOP** (gần như mọi thứ đều là object).

---

## Class và Object
- **Class**: bản thiết kế
- **Object**: thể hiện cụ thể của class

```java
class Person {
    String name;
    int age;
}

Person p = new Person();
p.name = "An";
p.age = 20;
```

## Thuộc tính và phương thức
- **Thuộc tính (Field)** : là các đặc tính của lớp đó
- **Phương thức (Method)** : Là các hành vi của lớp đó

```java

class Person{
    // các thuộc tính
    private String CitizenID;
    private String Name;
    private LocalDate dayOfBirth;

    // các phương thức

    public void Move(){
        System.out.println("Walk at 5km/h");
        System.out.println("Run at 15 - 20 km/h");
    }
}
```

## Constructor
> **Constructor**
>
> Trong Java constructor khá giống C++
- `Constructor` là một thứ được dùng để khởi tạo 1 object
- `Constructor` của 1 class phải trùng với class đó

```java

public class Person{
    // các thuộc tính
    private String CitizenID;
    private String Name;
    private LocalDate dayOfBirth;

    // Constructor mặc đinh
    public Person(){}

    // Constructor có tham số
    Person Person(String CitizenID, String Name, LocalDate dayOfBirth){
        this.CitizenID = CitizenID;
        this.Name = Name;
        this.dayOfBirth = dayOfBirth;
    }
}
```
## Các tính chất của OOP

*OOP trong `Java` thì cũng không khác OOP trong `C++` là bao có 1 số điểm lưu ý sẽ được nhắc đến trong quá trình đề cập*

### Encapsulation - Đóng gói
- *Tính đóng gói là một trong 4 tính chất vốn có của lập trình hướng đối tượng, nó là việc mà chúng ta che dấu dữ liệu bên trong bằng các `Access Modifier` $\rightarrow$ chỉ cho phép truy cập thuộc tính thông qua các phương thức được kiểm soát như getter, setter*
    #### Access Modifier:
    - `private` : chỉ cho phép truy cập nội bộ trong cùng lớp
    - `protected` : cho phép truy cập bằng lớp kế thừa
    - `public` : ai cũng có thể truy cập
    - `default` : truy cập được trong cùng 1 package

### Inheritance - Kế thừa