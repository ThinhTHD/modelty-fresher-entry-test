import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {
List<String>input=Arrays.asList("eat","tea","tan","ate","nat","bat");
List<List<String>>result=groupAnagrams(input);
        System.out.println(result);// Expected: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
    }

    public static List<List<String>> groupAnagrams(List<String> strings) {
        if (strings == null || strings.isEmpty()) {
            return new ArrayList<>();
        }
        Map<String, List<String>> anagramMap = new LinkedHashMap<>();
        for (String str : strings) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap
                    .get(sortedStr)
                    .add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }
}
