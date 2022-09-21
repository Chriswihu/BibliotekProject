
import Niveau2_logik.*;
import Niveau3_persistens.*;

import java.sql.SQLException;

public class StartMenu
{
    public void run() throws SQLException {

        int svar;

        while (true)
        {
            svar = TerminalInput.getInt("\n-------------------------------" + "\nVelkommen til Lyngby Bibliotek" + "\n-------------------------------" +
                    "\nKunde" + "\n-------------------------------" + "\n1. Opret ny kunde" + "\n2. Se alle registrerede kunder" +
                    "\n3. Find kunden via delvis input" + "\n4. Opdater kundeoplysninger" + "\n5. Slet en kunde" +
                    "\n-------------------------------" + "\nBøger" + "\n-------------------------------" +
                    "\n6. Opret ny bog" + "\n7. Vis alle registrerede bøger" + "\n8. Vis udlånte bøger" +
                    "\n9. Vis tilgængelige bøger" + "\n10. Find bøger via delvis input" + "\n11. Opdater en bog" +
                    "\n12. Slet en bog" + "\n-------------------------------" + "\nUdlån" + "\n-------------------------------" +
                    "\n13. Opret nyt udlån" + "\n14. Registrer retur af udlånt bog" + "\n15. Vis alle udlån" +
                    "\n16. Vis alle udlån for en kunde" + "\n17. Vis mest udlånte bøger" + "\n-------------------------------" +
                    "\nDATA" + "\n-------------------------------" + "\n18. Afslut" +
                    "\n-------------------------------" + "\nSkriv dit valg: ");

            switch (svar)
            {
                case 1:
                    KundeMapper.opretKunde();
                    break;
                case 2:
                    System.out.println("---------------------------------");
                    System.out.print("Oversigt over alle registrerede kunder:\n");
                    System.out.println("---------------------------------");
                    KundeMapper.udskrivKunder();
                    break;
                case 3:
                    KundeMapper.findKunde();
                    break;
                case 4:
                    KundeMapper.opdaterKunde();
                    break;
                case 5:
                    KundeMapper.sletKunde();
                    break;
                case 6:
                    BogMapper.opretBog();
                    break;
                case 7:
                    System.out.println("---------------------------------");
                    System.out.print("Oversigt over alle registrerede bøger:\n");
                    System.out.println("---------------------------------");
                    BogMapper.udskrivBøger();
                    break;
                case 8:
                    System.out.println("---------------------------------");
                    System.out.print("Oversigt over alle udlånte bøger:\n");
                    System.out.println("---------------------------------");
                    BogMapper.udskrivUdlånteBøger();
                    break;
                case 9:
                    System.out.println("---------------------------------");
                    System.out.print("Oversigt over alle tilgængelige bøger:\n");
                    System.out.println("---------------------------------");
                    BogMapper.udskrivTilgængeligeBøger();
                    break;
                case 10:
                    BogMapper.findBog();
                    break;
                case 11:
                    BogMapper.opdaterBog();
                    break;
                case 12:
                    BogMapper.sletBog();
                    break;
                case 13:
                    UdlånsMapper.opretUdlån();
                    break;
                case 14:
                    UdlånsMapper.registrerRetur();
                    break;
                case 15:
                    System.out.println("---------------------------------");
                    System.out.print("Oversigt over alle udlån:\n");
                    System.out.println("---------------------------------");
                    UdlånsMapper.udskrivUdlån();
                    break;
                case 16:
                    UdlånsMapper.visUdlånForEnKunde();
                    break;
                case 17:
                    System.out.println("---------------------------------");
                    System.out.print("Oversigt over de mest udlånte bøger:\n");
                    System.out.println("---------------------------------");
                    BogMapper.visMestUdlånteBøger();
                    break;
                case 18:
                    System.out.println("Programmet er afsluttet");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ugyldigt valg!");
                    break;
            }
        }
    }
}
