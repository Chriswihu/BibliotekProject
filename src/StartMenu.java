
import Niveau2_logik.*;
import Niveau3_persistens.*;

import java.sql.Connection;
import java.sql.DriverManager;
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
                    "\n6. Opret ny bøger" + "\n7. Vis alle registrerede bøger" + "\n8. Vis udlånte bøger" +
                    "\n9. Vis tilgængelige bøger" + "\n10. Find bøger via delvis input" + "\n11. Opdater en bog" +
                    "\n12. Slet en bog" + "\n-------------------------------" + "\nUdlån" + "\n-------------------------------" +
                    "\n13. Opret nyt udlån" + "\n14. Registrer retur af udlånt bog" + "\n15. Vis alle udlån" +
                    "\n16. Vis alle udlån for en kunde" + "\n17. Vis mest udlånte bøger" + "\n-------------------------------" +
                    "\nDATA" + "\n-------------------------------" + "\n18. Gem & Afslut" + "\n19. Afslut uden at gemme" +
                    "\n-------------------------------" + "\nSkriv dit valg: ");

            switch (svar)
            {
                case 1:
                    KundeMapper.opretKunde();
                    break;

//                case 4:
//                    databaseIO.updateGuestInfo(c);
//                    break;
//                case 5:
//                    databaseIO.deleteGuest(c);
//                    break;
//                case 6:
//                    System.out.println("---------------------------------");
//                    System.out.print("Oversigt over alle registrerede værelser:\n");
//                    System.out.println("---------------------------------");
//                    databaseIO.showAllRooms(c);
//                    break;
//                case 7:
//                    System.out.println("---------------------------------");
//                    System.out.print("Oversigt over alle ledige værelser:\n");
//                    System.out.println("---------------------------------");
//                    databaseIO.showAvailableRooms(c);
//                    break;
//                case 8:
//                    System.out.println("---------------------------------");
//                    System.out.print("Oversigt over alle beboede værelser:\n");
//                    System.out.println("---------------------------------");
//                    databaseIO.showOccupiedRooms(c);
//                    break;
//                case 9:
//                    databaseIO.showSpecificRoom(c);
//                    break;
//                case 10:
//                    databaseIO.bookRoom(c);
//                    break;
//                case 11:
//                    databaseIO.extendBooking(c);
//                    break;
//                case 12:
//                    System.out.println("---------------------------------");
//                    System.out.print("Oversigt over bookings:\n");
//                    System.out.println("---------------------------------");
//                    databaseIO.showAllBookings(c);
//                    break;
//                case 13:
//                    databaseIO.showAllBookingsForGuest(c);
//                    break;
//                case 14:
//                    databaseIO.showAllBookingsForRoom(c);
//                    break;
//                case 15:
//                    System.out.println("---------------------------------");
//                    System.out.println("\t\tRoom Service Menu");
//                    System.out.println("---------------------------------");
//                    databaseIO.showRoomServiceMenu(c);
//                    break;
//                case 16:
//                    databaseIO.orderRoomService(c);
//                    break;
//                case 17:
//                    System.out.println("---------------------------------");
//                    System.out.println("\tEkstra Service Menu");
//                    System.out.println("---------------------------------");
//                    databaseIO.showAdditionalServiceMenu(c);
//                    break;
//                case 18:
//                    databaseIO.orderAdditionalService(c);
//                    break;
//                case 19:
//                    databaseIO.showReceipt(c);
//                    break;
//                case 20:
//                    databaseIO.checkOut(c);
//                    break;
//                case 21:
//                    databaseIO.cancelBooking(c);
//                    break;
//                case 22:
//                    databaseIO.saveAndExit(c);
//                    break;
//                default:
//                    System.out.println("Ugyldigt valg!");
//                    break;
            }
        }
    }
}
