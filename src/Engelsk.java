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
}
