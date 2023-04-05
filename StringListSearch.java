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

    public static int orderedBinarySearch(ArrayList<String> items, String term){
        int low = 0; //lowest = start index
        int high = items.size()-1; //highest = last index
        int mid = high/2; //HALF

        while (low <= high){ // RUNS TILL TERM returns MID
            if (term.compareTo(items.get(mid)) == 0){
                return mid; //TERM IS MIDDLE
            }else if (term.compareTo(items.get(mid)) > 0){
                low = mid + 1; // LOWEST INDEX NOW AT MIDDLE> EVALUATE RIGHT SIDE
                mid = (low + high)/ 2; //new middle
            }else{
                high = mid - 1; //HIGHEST AT MID > EVALUATE LEFT SIDE
                mid = (low + high)/2;
            }
        }
        return -1;
    }
}