import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;

public class Finsk extends Dialog
{
    @Override
    public Dialog language(Dialog s) {
        return null;
    }

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
        menu.add("Valitse pyytämäsi toiminto luettelosta:" + '\n');
        menu.add("Paina 0: vaihtaaksesi toiseen kieleen");
        menu.add("Paina 1: luodaksesi ja lisätäksesi uuden käyttäjän");
        menu.add("Paina 2: luodaksesi ja lisätäksesi uuden kirjan");
        menu.add("Paina 3: lisätäksesi kirjan käyttäjäluetteloon");
        menu.add("Paina 4: poistaaksesi kirjan käyttäjäluettelosta");
        menu.add("Paina 5: poistaaksesi käyttäjän kirjaston tietokannasta");
        menu.add("Paina 6: päivittääksesi käyttäjän tiedot tai tila");
        menu.add("Paina 7: poistuaksesi ja sulkeaksesi ohjelman");
        return menu;
    }
    @Override
    public ArrayList list() {
        ArrayList list = new ArrayList<>();
        list.add("Vaihda kieltä");
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
