package Exception;

import java.io.IOException;

public class ThrowsProgram1 {
    public void m1() throws IOException
    {
        throw new IOException("Device Error");
    }
    public void m2() throws IOException
    {
        m1();
    }
    public void m3()
    {
        try
        {
           m2();
        }
        catch(IOException e)
        {
            System.out.println("Exception Handled");
        }
    }
    public static void main(String[] args) {
        ThrowsProgram1 obj = new ThrowsProgram1();
        obj.m3();
        System.out.println("Normal flow");
    }
}
