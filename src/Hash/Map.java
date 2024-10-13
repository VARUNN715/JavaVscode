package Hash;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String,Integer> students = new HashMap<>();

        students.put("varun", 100);
        students.put("venki", 100);
        students.put("tarun",98);
        students.put("varun",101 );
        for (String key : students.keySet()) {
            System.out.println(key+ " : "+students.get(key));
        }
    }
}
