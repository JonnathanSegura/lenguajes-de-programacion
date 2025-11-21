/*************************************************************************
 *  Compilation:  javac Bar.java
 *  Execution:    java Bar
 *
 *  Immutable data type for a bar in the bar chart racer.
 *************************************************************************/

public class Bar implements Comparable<Bar> {

    private final String name;
    private final int value;
    private final String category;

    // Creates a new bar.
    public Bar(String name, int value, String category) {
        if (name == null) {
            throw new IllegalArgumentException("name is null");
        }
        if (category == null) {
            throw new IllegalArgumentException("category is null");
        }
        if (value < 0) {
            throw new IllegalArgumentException("value is negative");
        }
        this.name = name;
        this.value = value;
        this.category = category;
    }

    // Returns the name of this bar.
    public String getName() {
        return name;
    }

    // Returns the value of this bar.
    public int getValue() {
        return value;
    }

    // Returns the category of this bar.
    public String getCategory() {
        return category;
    }

    // Compare two bars by value.
    public int compareTo(Bar that) {
        if (that == null) {
            throw new NullPointerException("argument to compareTo() is null");
        }
        // natural order: ascending by value
        return this.value - that.value;
    }

    // Sample client (optional)
    public static void main(String[] args) {
        Bar b1 = new Bar("Beijing", 22674, "East Asia");
        Bar b2 = new Bar("Cairo", 19850, "Middle East");
        System.out.println(b1.getName() + " " + b1.getValue() + " " + b1.getCategory());
        System.out.println(b2.getName() + " " + b2.getValue() + " " + b2.getCategory());
        System.out.println(b1.compareTo(b2) > 0);
    }
}
