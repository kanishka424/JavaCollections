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

        languages.remove("JS");   // remove first version
        if(languages.remove("R","R language")){ //remove second version
            System.out.println("R removed");
        }else{
            System.out.println("R not removed,key/value pair not followed");
        }

        languages.replace("R","R languages");//replaces version 1 ,this changes from put() if the key was not found nothing will happen whereas put() is opposite

        if(languages.replace("Ruby","Ruby language","Ruby language NEW")){//replace version 2
            System.out.println("Ruby replaced");
        }else{
            System.out.println("Ruby not replaced");
        }


        for(String key:languages.keySet()){//use of keySet()
            System.out.println("Key is "+key+"And value is "+languages.get(key));
        }



    }
}
