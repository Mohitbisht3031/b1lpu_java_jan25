package Day30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import Day5.strings;

public class diary {
    private static void create(String name){
        String fn = name+".txt";
        File f = new File(fn);
        try{
            if(f.createNewFile()){
                System.out.println("Diary with name "+fn+" created!");
            }else{
                System.out.println("Failed to create a new file with this name, it might already exist!");
            }
        }catch(Exception ex){
            System.err.println(ex);
        }
    }

    private static void update(String name){
        String fn = name+".txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fn))){
            Scanner sc = new Scanner(System.in);
            while(sc.hasNextLine()){
                String s = sc.nextLine();
                bw.append(s);
            }
            sc.close();
        }catch(Exception ex){
            System.err.println(ex);
        }
    }

    private static void read(String name){
        String fn = name+".txt";
        try(BufferedReader br = new BufferedReader(new FileReader(fn))){
            while(String s = br.readLine()){
                System.out.println(s);
            }
        }catch(Exception ex){
            System.err.println(ex);
        }
    }

    private static void delete(String name){
        String fn = name+".txt";
        file f = new File(fn);
        if(f.delete(fn)){
            System.out.println("Diary deleted");
        }else{
            System.out.println("Not able to delete!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello welcome to your diary maker!");
        System.out.println("1. Create a diray");
        System.out.println("2. Update a diary");
        System.out.println("3. Read from a diary");
        System.out.println("4. Delete a Diary");

        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        sc.nextLine();
        if(ch == 1){
            System.out.println("Give the name of the diary: ");
            String name = sc.nextLine();
            create(name);
        }else if(ch == 2){
            System.out.println("Give the name of the diary you want to update: ");
            String name = sc.nextLine();
            update(name);
        }else if(ch == 3){
            System.out.println("Give the name of the diary you want to ready from: ");
            String name = sc.nextLine();
            read(name);
        }else if(ch == 4){
            System.out.println("Give the name of the diary you want to delete: ");
            String name = sc.nextLine();
            delete(name);
        }else{
            System.out.println("You have given a wrong choice!!");
        }
    }
}
