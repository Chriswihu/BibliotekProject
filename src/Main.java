import Niveau2_logik.TerminalInput;
import Niveau3_persistens.Facade;
import Niveau3_persistens.Mapper;

public class Main
{
    public static void main(String[] args)
    {

        String svar;


        while (true) {

            svar = TerminalInput.getString("What is you wish? create / print / delete / update / exit");

            switch (svar)
            {
                case "create":
                    Facade.create();
                    break;
                case "print":
                    Facade.udskrivNavne();
                    break;
                case "delete":
                    Facade.slet();
                    break;
                case "update":
                    Facade.update();
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
        }



    }


}
