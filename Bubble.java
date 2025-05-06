import java.util.ArrayList;

public class Bubble{

    /*
    * Bubble Sort:
    * Swap the next number with the current number if the next number is smaller
    * (i.e., Swap if list[i] > list[i+1])
    */

    public void sort(ArrayList<Integer> list){
        for (int i = 0; i < list.size() - 1; i++){
            for (int j = 0; j < list.size() - 1 - i; j++){
                if (list.get(j) > list.get(j+1)){
                    swap(list, j);
                }
            }
        }
        // System.out.println(list);
    }

    public void swap(ArrayList<Integer> list, int j){
        int dummy = list.get(j);
        list.set(j, list.get(j+1));
        list.set(j+1, dummy);
    }
}