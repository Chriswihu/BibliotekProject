public class Main
{
    public static void main(String[] args)
    {
        String input;

        Dialog dialog = selectLanguage();

        while (true)
        {
            input = Input.getString(dialog.selectMenu().get(0).toString()+ '\n'
            + dialog.selectMenu().get(1).toString() + '\n'
            + dialog.selectMenu().get(2).toString() + '\n'
            + dialog.selectMenu().get(3).toString() + '\n'
            + dialog.selectMenu().get(4).toString() + '\n'
            + dialog.selectMenu().get(5).toString() + '\n'
            + dialog.selectMenu().get(6).toString() + '\n'
            + dialog.selectMenu().get(7).toString() + '\n');

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
        Boolean YorN = true;

        System.out.println(dialog.greet());
        while (YorN) {
            if (Input.getString(dialog.changeLanguage()).equals("y"))
            {
                switch (Input.getString(dialog.selectLanguage())) {
                    case "dk":
                        choice = new Dansk();
                        YorN = false;
                        break;
                    case "eng":
                        choice = new Engelsk();
                        YorN = false;
                        break;
                    case "fin":
                        choice = new Finsk();
                        YorN = false;
                        break;
                }
            }
//            else if (Input.getString(dialog.changeLanguage()).equals("n"))
//            {
//                choice = dialog;
//                break;
//            }
        }
        return choice;
    }
}