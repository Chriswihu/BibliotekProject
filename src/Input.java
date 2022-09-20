import java.util.Scanner;
public class Input {

    public static String getInput(String s){
        Scanner scanner = new Scanner(System.in);

        System.out.println(s + ":");

        return scanner.nextLine();
    }

    public static int getInt(String s) {

        int svar = 0;

        while (true) {
            try {


                svar = Integer.parseInt(getInput(s));
                break;
            } catch (Exception e) {
                System.out.println("Du skal skrive et tal");
            }
        }
        return svar;
    }
}
