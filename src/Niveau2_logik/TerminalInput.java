package Niveau2_logik;

import java.util.Scanner;

public class TerminalInput {
    public static String getString(String s)
    {
        System.out.println(s + ": ");
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();

    }

    public static int getInt(String s)
    {
        while (true) {
            try {
                int ans = Integer.parseInt(getString(s));
                return ans;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input");
            }
        }
    }
}
