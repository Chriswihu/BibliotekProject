import Niveau2_logik.TerminalInput;
import Niveau3_persistens.Facade;
import Niveau3_persistens.Mapper;

public class Main
{
    public static void main(String[] args)
    {

        String svar;


        while (true) {

            svar = TerminalInput.getString("Velkommen til Lyngby bibliotek" + "\n" + "Hvad ønsker du dig? Oprette bruger / Oprette bøger / Opret et lån / Aflever / Se de mest udlånte bøger / Afslut");

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
                case "Afslut":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Forkert input");
                    break;
            }
        }



    }


}
