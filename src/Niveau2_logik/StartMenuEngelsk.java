package Niveau2_logik;

import Niveau3_persistens.BogMapper;
import Niveau3_persistens.KundeMapper;
import Niveau3_persistens.UdlånsMapper;

import java.sql.SQLException;

public class StartMenuEngelsk
{
        public void run() throws SQLException {

            int svar;

            while (true)
            {
                svar = TerminalInput.getInt(
                        "\n-------------------------------" + "\nWelcome to Lyngby Library" + "\n-------------------------------" +
                        "\nCustomer" + "\n-------------------------------" + "\n1. Create new customer" + "\n2. View all registered customers" +
                        "\n3. Find the customer via partial input" + "\n4. Update customer information" + "\n5. Delete a customer" +
                        "\n-------------------------------" + "\nBooks" + "\n-------------------------------" +
                        "\n6. Create new book" + "\n7. Show all registered books" + "\n8. Show borrowed books" +
                        "\n9. Show available books" + "\n10. Find books via partial input" + "\n11. Update a book" +
                        "\n12. Delete a book" + "\n-------------------------------" + "\nLending" + "\n-------------------------------" +
                        "\n13. Create new loan" + "\n14. Register return of loaned book" + "\n15. Show all loans" +
                        "\n16. Show all loans for a customer" + "\n17. Show most borrowed books" + "\n-------------------------------" +
                        "\nDATA" + "\n-------------------------------" + "\n18. Exit" +
                        "\n-------------------------------" + "\nType your choice: ");

                switch (svar)
                {
                    case 1:
                        KundeMapper.opretKunde();
                        break;
                    case 2:
                        System.out.println("---------------------------------");
                        System.out.print("Overview of all registered customers:\n");
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
                        System.out.print("Overview of all registered books:\n");
                        System.out.println("---------------------------------");
                        BogMapper.udskrivBøger();
                        break;
                    case 8:
                        System.out.println("---------------------------------");
                        System.out.print("Overview of all borrowed books:\n");
                        System.out.println("---------------------------------");
                        BogMapper.udskrivUdlånteBøger();
                        break;
                    case 9:
                        System.out.println("---------------------------------");
                        System.out.print("Overview of all available books:\n");
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
                        System.out.print("Overview of all loans:\n");
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
                        System.out.println("The program has ended");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
            }
        }
    }