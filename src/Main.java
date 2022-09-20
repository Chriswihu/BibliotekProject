import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        selectLanguage();


    }

    private static void selectLanguage() {
        String ans = "";

        Scanner scanner = new Scanner(System.in);

        Dialog dialog = new Dansk();

        while (true)
        {
            System.out.println(dialog.greet());
            if (Input.getString(dialog.changeLanguage()).equalsIgnoreCase("y"))
            {
                switch (Input.getString(dialog.selectLanguage()))
                {
                    case "dk":
                        dialog = new Dansk();
                        break;
                    case "eng":
                        dialog = new Engelsk();
                        break;
                    case "fin":
                        dialog = new Finsk();
                        break;
                    default:
                        dialog = new Engelsk();
                }
            }
        }
    }

    public static void opret()
    {
        String sql = "INSERT INTO lånere (";
    }


}