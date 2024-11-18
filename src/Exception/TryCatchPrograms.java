package Exception;

public class TryCatchPrograms{
    public static void main(String[] args) {
        String name =null;
        try{

            System.out.println(name.charAt(0));
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Rest Code");
    }
}
