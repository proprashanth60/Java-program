package fooddeliverysystem;

import java.util.Map;

public class Cart {
	private Map<fooditem,Integer> items;

	public Cart(Map<fooditem, Integer> items) {
		super();
		this.items = items;
	}
	// addItem method
    public void addItem(fooditem foodItem, int quantity) {
        if (items.containsKey(foodItem)) {
            items.put(foodItem, items.get(foodItem) + quantity);
        } else {
            items.put(foodItem, quantity);
        }
    }

    // removeItem method
    public void removeItem(fooditem foodItem) {
        items.remove(foodItem);
    }

    // getItems method
    public Map<fooditem, Integer> getItems() {
        return items;
    }
	@Override
	public String toString() {
		return "cart [items=" + items + "]";
	}
    

   
	
	


    }

