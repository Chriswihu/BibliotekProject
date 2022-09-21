import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;

public class Dansk extends Dialog
{
    @Override
    public Dialog language(Dialog s) {
        return null;
    }

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
    public ArrayList selectMenu() {
        ArrayList menu = new ArrayList<>();
        menu.add("Vælg din ønskede Handling, fra listen: " + '\n');
        menu.add("Tryk 0: for at Vælge et andet Sprog");
        menu.add("Tryk 1: for at oprette en ny bruger");
        menu.add("Tryk 2: for at oprette en ny bog");
        menu.add("Tryk 3: for at tilføje en bog, til brugers liste");
        menu.add("Tryk 4: for at fjerne en bog, fra brugers liste ");
        menu.add("Tryk 5: for at slette en kunde fra Bibliotekets Database");
        menu.add("Tryk 6: for at opdatere en brugers info og status");
        menu.add("Tryk 7: for at afslutte og lukke programmet");
        return menu;
    }
    @Override
    public ArrayList list() {
        ArrayList<String> list = new ArrayList<>();
        list.add("ændre sprog");
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
