package Day29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "My name is "+this.name+" ,my age is "+this.age; 
    };
}

public class serialDeserial {
    public static void main(String[] args) {
        Person p = new Person("mohit", 1);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./test.txt"))){
            oos.writeObject(p);
            System.out.println("wrote the object successfully!");
        }catch (Exception e) {
            // TODO: handle exception
            System.err.println(ex);
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./text.txt"))){
            Person p2 = (Person)ois.readObject();
            System.out.println(p2.toString());
        }catch(Exception e){
            System.err.println(e);
        }

    }
}
