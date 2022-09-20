import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;

public class Engelsk extends Dialog{
    @Override
    public String greet() {
        return "hello and welcome!";
    }

    @Override
    public String changeLanguage() {
        return "du you want to change language?";
    }

    @Override
    public String selectLanguage() {
        return "select language eng/dk/fin?";
    }

    @Override
    public String selectMenu() {
        String menu = "Select your requested action";
        return menu;
    }
    @Override
    public ArrayList list() {
        ArrayList list = new ArrayList<>();
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
