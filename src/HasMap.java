import java.util.HashMap;
public class HasMap {
    public static void main(String[] args){
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();
        examScores.put("Math", 75);
        examScores.put("English", 100);
        examScores.put("CS", 96);

        System.out.println(examScores.toString());
        System.out.println(examScores.get("English"));
        examScores.remove("English");
        System.out.println(examScores.size());
        examScores.putIfAbsent("Sociology", 65);
        System.out.println(examScores.toString());
        examScores.replace("Sociology", 75);
        System.out.println(examScores.toString());
        System.out.println(examScores.getOrDefault("Religion", -1));
        System.out.println(examScores.containsKey("Math"));
        System.out.println(examScores.containsValue(100));
        System.out.println(examScores.isEmpty());

        System.out.println("---------------------------------------");

        examScores.forEach((key, value) -> {
            System.out.println(key + " - " + value);
        });

        examScores.forEach((key, value) -> {
            examScores.replace(key, value - 10);
        });

        System.out.println(examScores.toString());


    }
}
