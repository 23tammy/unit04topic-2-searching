import java.util.ArrayList;

public class StringListSearch {

    public static int unorderedSearch(ArrayList<String> items, String term) {
        int index;
        for (int i = 0; i < items.size(); i++){
            if (items.get(i) == term){
                index = i;
                return index;
            }
        }
        return -1;
    }
    
    public static int orderedLinearSearch(ArrayList<String> items, String term) {
        int index;
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).compareTo(term) == 0){
                index = i;
                return index;
            }else if (items.get(i).compareTo(term) > 0){
                return -1;
            }
        }
        return -1;
    }
}