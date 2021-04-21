import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class RandomMapsSorted {
    public static void main(String[] args) {

    }


    public static void MapIntString(){
        Map<Integer, String> map = new TreeMap<>
                (Map.of(6, "D", 4, "F", 1, "E", 3, "B", 2, "C", 5, "A"));
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())// <- Сортиране по ключ във възходящ ред
                .forEach(a -> System.out.printf("%d : %s%n", a.getKey(), a.getValue()));
        System.out.println("-----");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))// <- Сортиране по ключ в низходящ ред
                .forEach(a -> System.out.printf("%d : %s%n", a.getKey(), a.getValue()));
        System.out.println("-----");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())// <- Сортиране по стойност във възходящ ред
                .forEach(a -> System.out.printf("%d : %s%n", a.getKey(), a.getValue()));
        System.out.println("-----");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())// <- Сортиране по ключ във възходящ ред
                .filter(a -> a.getKey() % 2 != 0)// <- Взимаме само нечетните
                .forEach(a -> System.out.printf("%d : %s%n", a.getKey(), a.getValue()));
    }
    public static void MapStringIntArray() {
        Map<String, int[]> test = new LinkedHashMap<>();
        test.put("A", new int[2]);
        test.get("A")[0] = 3;
        test.get("A")[1] = 2;
        test.put("B", new int[2]);
        test.get("B")[0] = 4;
        test.get("B")[1] = 1;
        test.put("C", new int[2]);
        test.get("C")[0] = 3;
        test.get("C")[1] = 4;
        test.put("D", new int[2]);
        test.get("D")[0] = 3;
        test.get("D")[1] = 2;
        //<- Резултатът от .sorted((a, b) е в низходящ ред !!!
        test.entrySet().stream().sorted((a, b) -> {
            int result = Integer.compare(b.getValue()[0], a.getValue()[0]);//<-Сортираме по първата стойност
            if (result == 0) { //<-Ако тя е равна
                result = a.getKey().compareTo(b.getKey());//<-Сортираме по ключ
            }
            return result;
        }).forEach(e -> System.out.printf("%s%n key1: %d%n key2: %d%n",
                e.getKey(), e.getValue()[0], e.getValue()[1]));
        System.out.println("--------");

        test.entrySet().stream().sorted((a, b) -> {
            int result = Integer.compare(b.getValue()[1], a.getValue()[1]);//<-Сортираме по втората стойност
            if (result == 0) {//<-Ако тя е равна
                result = a.getKey().compareTo(b.getKey());//<-Сортираме по ключ
            }
            return result;
        }).forEach(e -> System.out.printf("%s%n key1: %d%n key2: %d%n",
                e.getKey(), e.getValue()[0], e.getValue()[1]));
        System.out.println("--------");

        test.entrySet().stream().filter(a -> a.getValue()[1] >= 2)//<-Филтрираме втората стойност да е >=2
                .sorted((a, b) -> {
                    int result = Integer.compare(b.getValue()[1], a.getValue()[1]);//<-Сортираме по втората стойност
                    if (result == 0) {//<-Ако тя е равна
                        result = result = Integer.compare(b.getValue()[0], a.getValue()[0]);//<-Сортираме по първата стойност
                        if (result == 0) {//<-Ако тя е равна
                            result = a.getKey().compareTo(b.getKey());//<-Сортираме по ключ
                        }
                    }
                    return result;
                }).forEach(e -> System.out.printf("%s%n key1: %d%n key2: %d%n",
                e.getKey(), e.getValue()[0], e.getValue()[1]));

    }
}

