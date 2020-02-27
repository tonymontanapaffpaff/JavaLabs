package by.gsu.pms;

public class Person implements Comparable<Person> {
    private String surname;
    private int age;
    private Gender gender;

    public Person(String surname, int age, Gender gender) {
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void show() {
        System.out.println("Surname = " + surname);
        System.out.println("Age = " + age);
        System.out.println("Gender = " + gender);
    }

    @Override
    public String toString() {
        return surname + ";" + age + ";" + gender;
    }

    @Override
    public int compareTo(Person person) {
        return Integer.compare(this.age, person.age);
    }
}
