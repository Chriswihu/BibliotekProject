public class Main
{
    public static void main(String[] args)
    {
        selectLanguage();

        String input;

        while (true)
        {
            Dialog dialog = selectLanguage();

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
        Dialog dialog = null;
        Boolean terminate = true;

        System.out.println("Choose language : ");
        while (terminate) {
            if (Input.getString("do you wish to change language").equalsIgnoreCase("y"))
            {
                switch (Input.getString("select language eng/dk/fin?")) {
                    case "dk":
                        dialog = new Dansk();
                        terminate = false;
                        break;
                    case "eng":
                        dialog = new Engelsk();
                        terminate = false;
                        break;
                    case "fin":
                        dialog = new Finsk();
                        terminate = false;
                        break;
                }
            }
        }
        return dialog;
    }
}