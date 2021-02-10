import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String,String> languages=new HashMap<>();

        languages.put("Java","java language");
        languages.put("Ruby","Ruby language");
        languages.put("JS","JS language");
        System.out.println(languages.put("Python","Python language"));//returns null because first time the key will be entered
        languages.put("R","R language");

        System.out.println(languages.put("Java","Java 2"));//returns previous value of the key "Java","java language"

        if(languages.containsKey("Java")){                          //how not to override values mistakenly in a map
            System.out.println("It already has Java as a key");
        }else{
            languages.put("Java","Java 3");
            System.out.println("Key added successfully");

        }

        for(String key:languages.keySet()){//use of keySet()
            System.out.println("Key is "+key+"And value is "+languages.get(key));
        }



    }
}
