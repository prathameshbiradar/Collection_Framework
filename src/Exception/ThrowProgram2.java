package Exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowProgram2 {
    public static void method() throws FileNotFoundException
    {
        FileReader file = new FileReader(":\\user\\hp\\name.txt");
        BufferedReader bf = new BufferedReader(file);

        throw new FileNotFoundException();
    }
    public static void main(String[] args) {
        try
        {
            method();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        System.out.println("Rest code");
    }
}
