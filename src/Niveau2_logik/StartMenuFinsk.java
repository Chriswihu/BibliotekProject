package Niveau2_logik;

import Niveau3_persistens.BogMapper;
import Niveau3_persistens.KundeMapper;
import Niveau3_persistens.UdlånsMapper;

import java.sql.SQLException;

public class StartMenuFinsk
{
        public void run() throws SQLException {

            int svar;

            while (true)
            {
                svar = TerminalInput.getInt("\n-------------------------------" + "\nTervetuloa Lyngby Libraryyn\" + \"\\n-------------------------------\" +\n" +
                                               "\"\\nAsiakas\" + \"\\n------------------------------\" + \"\\n1. Luo uusi asiakas\" + \" \\n2. Näytä kaikki rekisteröityneet asiakkaat\" +\n" +
                                               "\"\\n3. Etsi asiakas osittaisella syötöllä\" + \"\\n4. Päivitä asiakastiedot\" + \"\\n5. Poista asiakas\" +\n" +
                                               "\"\\n------------------------------\" + \"\\nKirjat\" + \"\\n------ -- -------------------------\" +\n" +
                                               "\"\\n6. Luo uusi kirja\" + \"\\n7. Näytä kaikki rekisteröidyt kirjat\" + \"\\n8. Näytä lainatut kirjat\" +\n" +
                                               "\"\\n9. Näytä saatavilla olevat kirjat\" + \"\\n10. Etsi kirjoja osittaisella syötöllä\" + \"\\n11. Päivitä kirja\" +\n" +
                                               "\"\\n12. Poista kirja\" + \"\\n-------------------------------\" + \"\\nLainaus\" + \" \\n-------------------------------\" +\n" +
                                               "\"\\n13. Luo uusi laina\" + \"\\n14. Rekisteröi lainatun kirjan palautus\" + \"\\n15. Näytä kaikki lainat\" +\n" +
                                               "\"\\n16. Näytä kaikki asiakkaan lainat\" + \"\\n17. Näytä useimmat lainatut kirjat\" + \"\\n------------------------ - -----\" +\n" +
                                               "\"\\nDATA\" + \"\\n-------------------------------\" + \"\\n18. Poistu\" +\n" +
                                               "\"\\n------------------------------\" + \"\\nKirjoita valintasi: ");

                switch (svar)
                {
                    case 1:
                        KundeMapper.opretKunde();
                        break;
                    case 2:
                        System.out.println("---------------------------------");
                        System.out.print("Yleiskatsaus kaikista rekisteröityneistä asiakkaista:\n");
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
                        System.out.print("Yleiskatsaus kaikista rekisteröidyistä kirjoista:\n");
                        System.out.println("---------------------------------");
                        BogMapper.udskrivBøger();
                        break;
                    case 8:
                        System.out.println("---------------------------------");
                        System.out.print("Yleiskatsaus kaikista lainatuista kirjoista:\n");
                        System.out.println("---------------------------------");
                        BogMapper.udskrivUdlånteBøger();
                        break;
                    case 9:
                        System.out.println("---------------------------------");
                        System.out.print("Yleiskatsaus kaikista saatavilla olevista kirjoista:\n");
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
                        System.out.print("Yleiskatsaus kaikista lainoista:\n");
                        System.out.println("---------------------------------");
                        UdlånsMapper.udskrivUdlån();
                        break;
                    case 16:
                        UdlånsMapper.visUdlånForEnKunde();
                        break;
                    case 17:
                        System.out.println("---------------------------------");
                        System.out.print("Yleiskatsaus eniten lainatuista kirjoista:\n");
                        System.out.println("---------------------------------");
                        BogMapper.visMestUdlånteBøger();
                        break;
                    case 18:
                        System.out.println("Ohjelma on päättynyt");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Virheellinen valinta!");
                        break;
                }
            }
        }
    }
