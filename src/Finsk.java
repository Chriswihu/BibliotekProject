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
    public String selectMenu() {
        return null;
    }
    @Override
    public ArrayList list() {
        return null;
    }
}
