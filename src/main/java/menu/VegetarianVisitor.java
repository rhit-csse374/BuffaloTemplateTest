package menu;

import java.util.ArrayList;
import java.util.List;

public class VegetarianVisitor implements Visitor {
    private List<MenuComponent> vegetarianItems;

    public VegetarianVisitor() {
        this.vegetarianItems = new ArrayList<>();
    }

    public List<MenuComponent> getVegetarianItems() {
        return this.vegetarianItems;
    }

    @Override
    public void visit(Menu menu) {
        // No-op for menus
    }

    @Override
    public void visit(MenuItem menuItem) {
        if (menuItem.isVegetarian()) {
            this.vegetarianItems.add(menuItem);
        }
    }
    
    @Override
    public void visit(MenuItemWithSizes menuItemWithSizes) {
        // Assuming MenuItemWithSizes are all vegetarian for this example
        this.vegetarianItems.add(menuItemWithSizes);
    }
}
