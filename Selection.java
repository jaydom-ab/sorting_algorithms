import java.util.ArrayList;

class Selection{

    /*
    * Selection Sort:
    * Find the minimum element in the list and swap it with the current pointer
    */

    public void sort(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++){
            int indexSmall = i;

            // Find smallest element and get index
            indexSmall = findSmallest(list, indexSmall);

            // Swap smallest value and value at current pointer (i)
            list.set(indexSmall, list.get(i));
            list.set(i, list.get(indexSmall));
         }
    }

    public int findSmallest(ArrayList<Integer> list, int indexSmall){
        int smallest = list.get(indexSmall);
        for (int j = indexSmall; j < list.size(); j++){
            if (list.get(j) < smallest){
                smallest = list.get(j);
                indexSmall = j;
            }
        }
        return indexSmall;
    }

    

}