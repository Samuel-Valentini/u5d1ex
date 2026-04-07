package samuelvalentini.u5d1ex.model;

public abstract class MenuItem {
    protected String name;

    public String getName() {
        return name;
    }

    public abstract double getPrice();

    public abstract int getCalories();

    
}
