package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
	private List<MenuComponent> menuComponents;
	private String name;
	private String description;
  
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
		this.menuComponents = new ArrayList<MenuComponent>();
	}
 
	public void add(MenuComponent menuComponent) {
		this.menuComponents.add(menuComponent);
	}
 
	public void remove(MenuComponent menuComponent) {
		this.menuComponents.remove(menuComponent);
	}
 
	public MenuComponent getChild(int k) {
		return this.menuComponents.get(k);
	}
 
	public String getName() {
		return this.name;
	}
 
	public String getDescription() {
		return this.description;
	}

	public void print() {
		System.out.print("\n" + this.getName());
		System.out.println(", " + this.getDescription());
		System.out.println("---------------------");
  
		for (MenuComponent menuComponent : menuComponents) {
			menuComponent.print();
		}
	}
	
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (MenuComponent component : menuComponents) {
            component.accept(visitor);
        }
    }
}
