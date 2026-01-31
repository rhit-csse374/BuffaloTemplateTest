package menu;

public class MenuItemWithSizes extends MenuComponent {
    private String name;
    private String description;
    private double price;
    private MenuItemSize size;
    
    public MenuItemWithSizes(String name, 
                             String description, 
                             MenuItemSize size,
                             double price) 
    { 
        this.name = name;
        this.description = description;
        this.size = size;
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
    public MenuItemSize getSize() {
        return size;
    }

    @Override
	public String toString() {
		return "  " + getName() 
		+ ", " + getSize() + ": $" + getPrice()
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
