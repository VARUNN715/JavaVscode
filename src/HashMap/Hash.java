package HashMap;
import java.util.HashMap;
public class Hash {
    public static void main(String[] args) {
        //hash map is a key value pairs
        // example: (name,email)
        HashMap<String,String> countries = new HashMap<String,String>();
        //add a key and value

        countries.put("USA","Washington DC");
        countries.put("India","New Delhi");
        countries.put("Russia", "Moscow");
        // System.out.println(countries);
        //countries.remove("USA");
        //String a = countries.get("India");
        //System.out.println(a);
        // countries.clear();
        //int b = countries.size();
        //System.out.println(b);

        // countries.replace("USA", "New York");
        // boolean a = countries.containsKey("England");
        // System.out.println(a);

        for(String i: countries.keySet()){
            System.out.println(i+" : "+countries.get(i));
            
        }

    }
}
