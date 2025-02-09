package edu.neu.csye6200;

class ElectronicItemFactory implements Factory {
    private static ElectronicItemFactory instance;
    private ElectronicItemFactory() {}
    public static ElectronicItemFactory getInstance() {
        if (instance == null) instance = new ElectronicItemFactory();
        return instance;
    }
    @Override
    public Item createItem(String csv) { return new ElectronicItem(csv); }
}