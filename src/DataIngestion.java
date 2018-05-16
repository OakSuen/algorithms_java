import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class DataIngestion {
    public static void main(String[] args) throws Exception{
        List<String> list = new ArrayList<>();
        list.add("alpha");
        list.add("beta");
        list.add("beta");
        list.add("gamma");
        System.out.println(list);

        Set<String> set = new HashSet<>();
        set.add("alpha");
        set.add("beta");
        set.add("beta");
        set.add("gamma");
        System.out.println(set);

        for (String el: set) {
            System.out.println(el);
        }

        Map<String, String> map = new HashMap<>();
        map.put("alpha", "α");
        map.put("beta", "β");
        map.put("gamma", "γ");
        System.out.println(map);

        String min = Collections.min(list);
        String max = Collections.max(list);
        System.out.println(min + "   " + max);
        Collections.shuffle(list);
        Collections.sort(list);
        System.out.println(list);

        File file = new File("abc.txt");
        System.out.println(file.exists());  //false

        List<String> lines = new ArrayList<>();

        try(InputStream is = new FileInputStream(file)) {
            try (InputStreamReader isReader = new InputStreamReader(is, StandardCharsets.UTF_8)){
                try (BufferedReader reader = new BufferedReader(isReader)) {
                    while (true) {
                        String line = reader.readLine();
                        if (line == null) {
                            break;
                        }
                        lines.add(line);
                    }
                    isReader.close();
                }
            }
        }

//        Path path = Paths.get("abc.txt");
//        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
//        for (String el: lines) {
//            System.out.println(el);
//        }
//        System.out.println(lines);
    }
}
