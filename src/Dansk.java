import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;

public class Dansk extends Dialog
{
    @Override
    public String greet() {
        return "hej og velkommen!";
    }

    @Override
    public String changeLanguage() {
        return "ønsker du at skifte sprog?";
    }

    @Override
    public String selectLanguage() {
        return "angiv sprog dk/eng/fin?";
    }

    @Override
    public String selectMenu() {
        String menu = "vælg din ønskede handling";
        return menu;
    }
    @Override
    public ArrayList list() {
        ArrayList<String> list = new ArrayList<>();
        list.add("tilføj låner");
        list.add("tilføj bog");
        list.add("lån bog");
        list.add("returner bog");
        list.add("slet låner");
        list.add("opdater låner");
        list.add("exit ud af program");
        return list;
    }
}
