import java.util.ArrayList;

public class bubble{
    public static void main(String[] args){
        ListGenerator listGen = new ListGenerator();
        ArrayList<Integer> list = listGen.generate(15);

        /*
         * Bubble Sort:
         * Swap numbers until the largest number 
         */
        
        int count = 0;

        for (int i = 0; i < list.size() - 1; i++){
            for (int j = 0; j < list.size() - 1 - i; j++){
                if (list.get(j) > list.get(j+1)){
                    int dummy = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, dummy);
                }
                count++;
                System.out.println(count + " : " + list); 
            }
        }
    }
}