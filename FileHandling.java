import java.io.*;
import java.io.IOException;
// import java.util.Scanner;
public class FileHandling {
    public static void main(String[] args) throws IOException {
        try{
            //File Creation
            File f = new File("myFile.txt");
            // Scanner sc = new Scanner(f);
            File f1 = new File("newFile.txt");
            
            if(f.createNewFile()){
                System.out.println("File "+f.getName()+ " Is Created Successfully");
            } else {
                System.err.println("This "+f.getName()+" File Was Already Exists");
            }
            if(f1.createNewFile()){
               System.out.println("File "+f1.getName()+ " Is Created Successfully");
            } else {
               System.err.println("This "+f1.getName()+" File Was Already Exists");
            }

            //Read a File
            // if(sc.hasNextLine()){
            //     String readFile = sc.nextLine();
            //     System.out.println(readFile+" File Was Read Successfully");
            // }
            // sc.close();

            //Write a File
            FileWriter fw = new FileWriter(f1);
            fw.write("Hello From 1st File Writer\n");  //write
            fw.append("Hello From 2nd File Writer");  //append
            fw.close();

            File deleteFile = new File("myFile.txt");
            if(deleteFile.delete()) {
                System.out.println(deleteFile.getName()+" File Was Deleted Successfully");
            } else{
                System.err.println("Error Occurred While Deleting "+deleteFile.getName()+" File");
        }

        } catch(IOException e) {
            System.out.println("Error Occurred While Creating a File");
            e.printStackTrace();
        }
    }
}
