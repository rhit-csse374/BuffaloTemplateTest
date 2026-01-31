package menu;

enum MenuItemSize {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private final String printName;

    private MenuItemSize(String printName) {
        this.printName = printName;
    }
    @Override
    public String toString() {
        return printName;   
    }

    public static MenuItemSize fromString(String text) {
    for (MenuItemSize size : MenuItemSize.values()) {
        if (size.name().equalsIgnoreCase(text)) {
            return size;
        }
    }
    return SMALL;
    }
}

