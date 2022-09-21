import java.util.Scanner;

public class Input
{

    public static String getString(String s)
    {
        System.out.println(s);
        Scanner scan = new Scanner(System.in);

        return scan.nextLine();
    }

    public static int getInt(String s)
    {
        int svar = 0;

        while (true) {
            try {
                svar =Integer.parseInt(getString(s));
                break;
            }
            catch (NumberFormatException e){
            System.out.println("skal være et nummer");
            }
        }
        return svar;
    }
}

