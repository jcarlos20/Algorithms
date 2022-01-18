import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerReview {
    public static void main(String[] args) {
        List<String> repository = Arrays.asList("mobile", "mouse",  "moneypot", "monitor", "mousepad");
        String customerQuery = "mouse";
        System.out.println(searchSuggestions(repository, customerQuery));
    }

    public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery){
        if(customerQuery == null || customerQuery.length()<2) return null;
        List<List<String>> suggestions = new ArrayList<>();
        for(int i=1; i<customerQuery.length();i++){
            String tempString = customerQuery.substring(0, i+1).toLowerCase();
            
            // Option 1
            // List<String> tempArray = new ArrayList<>();
            // for(int j=0; j<repository.size();j++){
            //     if(repository.get(j).toLowerCase().indexOf(tempString)==0){
            //         tempArray.add(repository.get(j));
            //     }
            // }
            // tempArray.stream().sorted().limit(3).collect(Collectors.toList());
            // suggestions.add(tempArray);

            // Option improved
            List<String> tempArray = repository.stream()
            .map(word-> word.toLowerCase())
            .filter(word-> word.startsWith(tempString))
            .sorted()
            .limit(3)
            .collect(Collectors.toList());
            suggestions.add(tempArray);
        }
        return suggestions;
    }
}
