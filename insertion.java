import java.util.ArrayList;

public class insertion{
    public static void main (String[] args){
        ListGenerator listGen = new ListGenerator();
        ArrayList<Integer> list = listGen.generate(15);
        
        /*
         *  Use Insertion Sort on the list:
         *  Swap the current element with the previous element if the value of the previous
         *  is greater than the value of the current
         *  (TL;DR: Swap while list[i-1] > list[i])
         */

        int i = 0;
        while (i < list.size()){
            int j = i;
            while (j>0 && list.get(j-1) > list.get(j)){
                int dummy = list.get(j); 
                list.set(j, list.get(j-1));
                list.set(j-1, dummy);
                j--;
                System.out.println(list);
            }
            i++;
        }
            
    }

}