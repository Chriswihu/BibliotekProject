import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;

public class Engelsk extends Dialog{

    @Override
    public Dialog language(Dialog s) {
        return null;
    }

    @Override
    public String greet() {
        return "hello and welcome!";
    }

    @Override
    public String changeLanguage() {
        return "du you want to change language?" + '\n' + "Press Y for Yes ------- Press N for No";
    }

    @Override
    public String selectLanguage() {
        return "select language eng/dk/fin?";
    }

    @Override
    public ArrayList selectMenu() {
        ArrayList menu = new ArrayList<>();
        menu.add("Select your requested action from the list: " + '\n');
        menu.add("Press 0: to change to another Language");
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
        list.add("change language");
        list.add("add lender");
        list.add("add book");
        list.add("loan book");
        list.add("return book");
        list.add("delete lender");
        list.add("update lender");
        list.add("exit program");
        return list;
    }

}
