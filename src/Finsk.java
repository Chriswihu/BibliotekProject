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
}
