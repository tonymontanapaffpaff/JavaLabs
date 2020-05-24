package by.gsu.pms.beans;

import java.io.Serializable;

public class Person implements Serializable {
    private String surname;
    private int age;
    private Gender sex;

    public Person() {
    }

    public Person(String surname, int age, Gender sex) {
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public Person(String surname, int age, int sex) {
        this(surname, age, Gender.values()[sex]);           // 0 - MALE, 1 - FEMALE
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return surname + ";" + age + ";" + sex;
    }
}
