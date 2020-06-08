import java.io.*;
import java.util.Scanner;

public class FileReader {
    public static void main(String [] args) throws IOException{


        File file = new File("C:\\Users\\arunm\\OneDrive\\Desktop\\captmidn.txt");

            Scanner scan = new Scanner(file);

            String newFile = "";

            while(scan.hasNextLine()){
//                System.out.println(scan.nextLine());
                newFile = newFile.concat(scan.nextLine()+ "\n");
            }

            FileWriter writer = new FileWriter("C:\\Users\\arunm\\OneDrive\\Desktop\\new.txt");
            writer.write(newFile);
            writer.close();

//        if(file.exists()){
//            System.out.println("exists");
//        }else{
//            System.out.println("does not exist");
//        }


    }
}
