package Day33;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import Day24.staticNestedEx;

// Implement Contact class here
class Contact implements Serializable{
    String Name;
    String No;
    Contact(String Name,String No){
        this.Name = Name;
        this.No = No;
    }

    public String toString() {
        return "The name of the person is "+this.Name+" the contact no. is "+this.No;
    };
}

public class contactDiary {

    private static void create(Stirng name){
        String fn = name+".txt";
        File f = new File(fn);
        try{
            if(f.createNewFile()){
                System.out.println("created a new file with name "+fn);
            }else System.out.println("Not able to create a new file with name "+fn);
        }catch(Exception ex){
            System.err.println(ex);
        }
    }

    private static void update(String name){
        String fn = name+".txt";
        Scanner sc = new Scanner(System.in);
        String pn = sc.nextLine();
        String no = sc.nextLine();
        Contact c = new Contact(pn,no);
        sc.close();
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fn))){
            oos.writeObject(c);
            System.out.println("wrote the contact succesfully");
        }catch(Exception ex){
            System.err.println(ex);
        }
    }

    // implement this
    private static void read(String name){

    }

    private static void delete(String name){
        String fn = name+".txt";
        File f = new File(fn);
        if(f.delete()){
            System.out.println(fn+" file deleted");
        }else System.out.println("not able to delete file "+fn);
    }

    public static void main(String[] args) {
        System.out.println("Hey Welcome to the Contact Diary maker : ");
        System.out.println("1. Create");
        System.out.println("2. Update");
        System.out.println("3. Read");
        System.out.println("4. Delete");

        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        sc.nextLine();
        // the situation based on the option user have opted for
        String name = sc.nextLine();
        if(ch == 1){
            create(name);
        }else if(ch == 2){
            update(name);
        }else if(ch == 3){
            read(name);
        }else if(ch == 4){
            delete(name);
        }else{
            System.out.println("You have opted for wrong choice");
        }

        sc.close();
    }
}
