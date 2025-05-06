import java.util.ArrayList;

public class Insertion{

    /*
     *  Insertion Sort:
     *  Swap the current element with the previous element if the value of the previous
     *  is greater than the value of the current
     *  (TL;DR: Swap while list[i-1] > list[i])
     */

    public void sort(ArrayList<Integer> list){
        int i = 0;
        while (i < list.size()){
            int j = i;
            while (j>0 && list.get(j-1) > list.get(j)){
                swap(list, j);
                j--;
            }
            i++;
        }
        // System.out.println(list);
    }

    public void swap(ArrayList<Integer> list, int j){
        int dummy = list.get(j); 
        list.set(j, list.get(j-1));
        list.set(j-1, dummy);
    }

}