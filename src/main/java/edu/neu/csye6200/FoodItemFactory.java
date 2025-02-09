package edu.neu.csye6200;

class FoodItemFactory implements Factory {
    @Override
    public Item createItem(String csv) {
        return new FoodItem(csv);
    }
}
