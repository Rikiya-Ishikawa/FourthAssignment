import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String... args) {
        List<String> names = List.of("yamada", "tanaka", "yasuda", "suzuki", "iida");
        List<String> result = new ArrayList<>();

        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).contains("a")) {
                result.add(names.get(i));
            }
        }
        System.out.println(result);

        List<String> names2 = List.of("ymada2", "tanaka2", "yasuda2", "suzuki2", "iida2");
        List<String> result2 = new ArrayList<>();

        for(String name : names2) {
            if(name.contains("a")) {
                result2.add(name);
            }
        }
        System.out.println(result2);

        List<String> names3 = List.of("ymada3", "tanaka3", "yasuda3", "suzuki3", "iida3");
        List<String> result3 = names3.stream().filter(name -> name.contains("a")).toList();
        System.out.println(result3);

    }
}