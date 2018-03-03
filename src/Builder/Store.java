package Builder;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Item> list = new ArrayList<Item>();
    public void addItem(Item item){
        list.add(item);

    }
    public float getCost(){
        float cost = 0.0f;
        for(Item item : list){
            cost = cost + item.price();
        }
        return cost;
    }
    public void showItem(){
        for(Item item : list){
            System.out.println("Name : " + item.name());
            System.out.println("Price : " + item.price());
            System.out.println("Packing : " + item.packing().pack());
        }
    }
}
