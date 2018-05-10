import java.util.*;
import java.io.*;
class HashTesting{
   public static void main(String[]args){
      String name;
      int num;
      File file = new File("G:\\Csc103\\Projects\\Project Five\\Alpha\\names.txt");
           try{
           Scanner read = new Scanner(file);
           while(read.hasNext()){
               name = " ";//Name
               num = 0;//Social Security
               name = read.next();
               num = read.nextInt();
           }
            read.close();
           }catch(FileNotFoundException e){
               System.out.println("File was not found");
           }catch(Exception e){
               System.out.println("File was not found");
           }

   }
}