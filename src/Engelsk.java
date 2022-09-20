public class Engelsk extends Dialog{


    @Override
    public String greetings() {
        return "hello and welcome!";
    }

    @Override
    public String changeLanguage() {
        return "would you like to change language?";
    }

    @Override
    public String selectLanguage() {
        return "please select a language eng/dk/fin?";
    }
}