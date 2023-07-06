public enum Topping {
    TOMATO, MUSTARD, PICKLES, CHEDDAR, BACON;


    // add custom methods on enum
    public double getPrice() {
        return switch(this) {
            case TOMATO -> 0.5;
            case MUSTARD -> 1.0;
            default -> 0.0;
        };
    }
}
    