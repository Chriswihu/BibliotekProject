import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ans = "";

        Dialog dialog = new Dansk();

        while (true) {
            System.out.println(dialog.greetings());

            if(Input.getInput(dialog.changeLanguage()).equalsIgnoreCase("y"))

            switch(Input.getInput(dialog.selectLanguage())){
                case "dk":
                    dialog = new Dansk();
                    break;
                case "eng":
                    dialog = new Engelsk();
                    break;
                case "fr":
                    dialog = new Fransk();
                    break;
                default:
                    dialog = new Dansk();
            }
        }

    }
}