package Day28;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class person{
    String name;
    int age;
    person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class serialize_De {
    public static void main(String[] args) {
        person obj = new person("mohit", 1);
        // serilization of the object and writing it into a file!
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./test.txt"))){
            oos.writeObject(obj);
        }catch(IOException ex){
            System.err.println(ex);
        }
    }
}
