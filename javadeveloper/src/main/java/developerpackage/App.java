package developerpackage;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user = new User("Olexandr","Lutskiy");
        String userGson = new Gson().toJson(user);
        System.out.println(userGson);
    }
}
