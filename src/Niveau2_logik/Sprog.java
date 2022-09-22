package Niveau2_logik;

import java.sql.SQLException;
import java.util.Scanner;

public class Sprog {

    Scanner sc = new Scanner(System.in);

    public String skiftSprog() throws SQLException {
        System.out.println("Hej og velkommen. \nVælg dit sprog (dansk / engelsk / finsk): ");
        String chosenLanguage = sc.nextLine().toLowerCase();
        String selectedLanguage = "";

        switch (chosenLanguage) {
            case "dansk":
                selectedLanguage = "Du har valgt dansk sprog. Tryk y for at fortsætte";
                if (TerminalInput.getString(selectedLanguage).equals("y")) {
                    StartMenu startMenu = new StartMenu();
                    startMenu.run();
                }
                break;
            case "engelsk":
                selectedLanguage = "You have chosen english language. Press y to continue";
                if (TerminalInput.getString(selectedLanguage).equals("y")) {
                    StartMenuEngelsk startMenuEngelsk = new StartMenuEngelsk();
                    startMenuEngelsk.run();
                }
                break;
            case "finsk":
                selectedLanguage = "Olet valinnut suomen kielen. Paina y jatkaaksesi";
                if (TerminalInput.getString(selectedLanguage).equals("y")) {
                    StartMenuFinsk startMenuFinsk = new StartMenuFinsk();
                    startMenuFinsk.run();
                }
                break;
            default:
                System.out.println("Du har ikke valgt et sprog.");
                break;
        }

        return selectedLanguage;

    }
}
