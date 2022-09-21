import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.List;

public abstract class Dialog
{
    public abstract Dialog language(Dialog s);
    public abstract String greet();
    public abstract String changeLanguage();
    public abstract String selectLanguage();
    public abstract ArrayList selectMenu();
    public abstract ArrayList list();

}