public class Main
{
    public static void main(String[] args)
    {
        String input;

        Dialog dialog = selectLanguage();

        while (true)
        {
            input = Input.getString(dialog.selectMenu());

            switch (input)
            {
                case "0":
                    selectLanguage();
                    break;
                case "1":
                    System.out.println(dialog.list().get(0));
                    break;
                case "2":
                    System.out.println(dialog.list().get(1));
                    break;
                case "3":
                    System.out.println(dialog.list().get(2));
                    break;
                case "4":
                    System.out.println(dialog.list().get(3));
                    break;
                case "5":
                    System.out.println(dialog.list().get(4));
                    break;
                case "6":
                    System.out.println(dialog.list().get(5));
                    break;
                case "7":
                    System.out.println(dialog.list().get(6));
                    System.exit(0);
                    break;
                default:

            }
        }

    }

    private static Dialog selectLanguage() {
        Dialog dialog = new Engelsk();
        Dialog choice = null;
        Boolean terminate = true;

        System.out.println(dialog.greet());
        while (terminate) {
            if (Input.getString(dialog.changeLanguage()).equalsIgnoreCase("y"))
            {
                switch (Input.getString(dialog.selectLanguage())) {
                    case "dk":
                        choice = new Dansk();
                        terminate = false;
                        break;
                    case "eng":
                        choice = new Engelsk();
                        terminate = false;
                        break;
                    case "fin":
                        choice = new Finsk();
                        terminate = false;
                        break;
                }
            }
        }
        return choice;
    }
}