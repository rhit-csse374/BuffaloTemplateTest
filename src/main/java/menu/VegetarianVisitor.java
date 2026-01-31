package menu;

import java.util.ArrayList;
import java.util.List;

public class VegetarianVisitor implements Visitor {
    private List<MenuItem> vegetarianItems;

    public VegetarianVisitor() {
        this.vegetarianItems = new ArrayList<>();
    }

    public List<MenuItem> getVegetarianItems() {
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
}
