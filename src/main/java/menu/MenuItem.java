package menu;
public class MenuItem extends MenuComponent {
	private String name;
	private String description;
	private boolean vegetarian;
	private double price;
    
	public MenuItem(String name, 
	                String description, 
	                boolean vegetarian, 
	                double price) 
	{ 
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
  
	public String getName() {
		return name;
	}
  
	public String getDescription() {
		return description;
	}
  
	public double getPrice() {
		return price;
	}
  
	public boolean isVegetarian() {
		return vegetarian;
	}
  
	@Override
	public String toString() {
		return "  " + getName() +
		(this.isVegetarian() ? "(v)" : "") + ", "  
		+ getPrice()
		+ "\n" + "     -- " + getDescription();
	}

	public void print() {
		System.out.println(this.toString());
	}

	@Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
