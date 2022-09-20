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
}
