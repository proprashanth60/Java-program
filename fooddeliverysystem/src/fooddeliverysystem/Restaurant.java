package fooddeliverysystem;

import java.util.List;

public class Restaurant {
	private int id;
	private String name;
	private List<fooditem> menu;
	public Restaurant(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.menu = menu;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public List<fooditem> getMenu() {
		return menu;
	}
	

	public void addfooditem(fooditem b) {
		menu.add(b);
	}
	public void removefooditem(int fooditemid)
	{
		for(int i=0;i<menu.size();i++) {
			if(menu.get(i).getId()==fooditemid) {
				menu.remove(i);
				break;
			}
		}
	}
}
