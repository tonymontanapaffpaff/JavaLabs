package by.gsu.pms;

import by.gsu.pms.beans.Person;

import java.io.*;

public class Deserialization {

    public Person[] deserialization() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("temp.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Person[] people = (Person[]) objectInputStream.readObject();
        objectInputStream.close();
        return people;
    }
}
