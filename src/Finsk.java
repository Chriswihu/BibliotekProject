import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;

public class Finsk extends Dialog{
    @Override
    public String greet() {
        return "Hei ja tervetuloa";
    }

    @Override
    public String changeLanguage() {
        return "haluatko vaihtaa kieltä?";
    }

    @Override
    public String selectLanguage() {
        return "määritä kieli fin/dk/eng?";
    }

    @Override
    public ArrayList selectMenu() {
        ArrayList menu = new ArrayList<>();
        menu.add("Select your requested action from the list : " + '\n');
        menu.add("Press 1: to create and add a new user");
        menu.add("Press 2: to create and add a new book");
        menu.add("Press 3: to add a book to a user's list");
        menu.add("Press 4: to remove a book from the user's list");
        menu.add("Press 5: to remove a user from the Library Data Base");
        menu.add("Press 6: to update a user's info or status");
        menu.add("Press 7: to exit and close the program");
        return menu;
    }
    @Override
    public ArrayList list() {
        ArrayList list = new ArrayList<>();
        list.add("lisää lainanantaja");
        list.add("lisää kirja");
        list.add("lainakirja");
        list.add("palautuskirja");
        list.add("poista lainanantaja");
        list.add("päivitä lainanantaja");
        list.add("poistu ohjelmasta");
        return list;
    }
}
