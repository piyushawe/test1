package testing;

        import java.util.Locale;
        import java.util.ResourceBundle;

public class Test {
    public static void main(String arg[]){
        Locale l= new Locale("fr");
        ResourceBundle bundle = ResourceBundle.getBundle("Message");
        System.out.println(Locale.FRANCE+ bundle.getString("Greeting"));
    }
}
