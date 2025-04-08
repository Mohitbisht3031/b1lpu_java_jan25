package Day28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandeling {
    public static void main(String[] args) {
        File f = new File("./test.txt");
        // to create a new empty file
        try{
            if(f.createNewFile()){
                System.out.println("file created "+f.getName());
            }else System.out.println("File not created");
        }catch(Exception ex){
            System.err.println(ex);
        }

        // write in a file using file writer
        try{
            FileWriter fw = new FileWriter("./test.txt");
            fw.write("Hey my name is Mohit");
            fw.close();
        }catch(IOException ex){
            System.err.println(ex);
        }

        // write using buffer writter
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("./test.txt"));
            bw.write("hello from the buffer writter");
            bw.newLine();
            bw.write("isn't it amazing");
            bw.close();
        }catch(IOException ex){
            System.err.println(ex);
        }

        // in the above code it will rewrite the entire file
        // but if i want to append in a file
        try{
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(f,true));
            bw2.write("hey trying to append");
            bw2.newLine();;
            bw2.write("New line ");
        }catch(IOException ex){
            System.err.println(ex);
        }

        // read from a file
        try{
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch(FileNotFoundException ex){
            System.err.println(ex);
        }

        // using buffer reader
        try{
            BufferedReader br = new BufferedReader(new FileReader(f));
            while(String s = br.readLine() != null){
                System.out.println(s);
            }
            br.close();
        }catch(IOException ex){
            System.err.println(ex);
        }

        // way to delete a file
        if(f.delete()){
            System.out.println("file deleted");
        }else System.out.println("failed to delete the file");

    }

}
