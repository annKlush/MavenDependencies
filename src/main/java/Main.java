import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
public class Main {
    public static void main(String[] args) {
        User user = new User("Hanna", "Kliushnichenko");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String s = gson.toJson(user);

        System.out.println(s);
    }
}