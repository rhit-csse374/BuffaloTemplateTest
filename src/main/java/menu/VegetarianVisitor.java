package menu;

import java.util.ArrayList;
import java.util.List;

public class VegetarianVisitor implements Visitor {
    private ArrayList<MenuItem> vegetarianItems = new ArrayList<>();

    public List<MenuItem> getVegetarianItems() {
        return vegetarianItems;
    }

    @Override
    public void visit(Menu menu) {
        // No-op for menus
    }

    @Override
    public void visit(MenuItem menuItem) {
        if (menuItem.isVegetarian()) {
            vegetarianItems.add(menuItem);
        }
    }
}
