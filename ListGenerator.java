import java.util.ArrayList;
import java.util.Random;

public class ListGenerator{
    public ArrayList<Integer> generate(int i){
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int x = 0; x < i; x++){
            list.add(r.nextInt(101));
        }
        return list;
    }
}


