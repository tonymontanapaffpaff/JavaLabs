package by.gsu.pms;

import by.gsu.pms.beans.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

    public void serialization(Person[] people) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("temp.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(people);
        objectOutputStream.close();
    }
}
