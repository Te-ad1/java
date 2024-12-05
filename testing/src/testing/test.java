package testing;

import java.io.FileWriter;
import java.io.IOException;

public class test {

    public static void main(String[] args) throws IOException {
       
        String lastName = "te-ad"; 
        String firstName = "pogi"; 
        String middleInitial = "m"; 

       
        String fullName = lastName + ", " + firstName + " " + middleInitial + ".";

        
        System.out.println(fullName);

   
        FileWriter writer = new FileWriter("name.txt");
        writer.write(fullName);
        writer.close();
        System.out.println("Name saved to name.txt");
    }
}