package menu;

public interface Visitor {
    void visit(Menu menu);
    void visit(MenuItem menuItem);
    void visit(MenuItemWithSizes menuItemWithSizes);
}
