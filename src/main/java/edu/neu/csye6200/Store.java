package edu.neu.csye6200;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;


class Store extends AbstractStore {
    @Override
    public void demo() {
        try {
            // To Read and create objects from CSV file
            List<String> foodLines = FileUtil.readFile("src/main/java/edu/neu/csye6200/FoodItemCSV.txt");
            Factory foodFactory = new FoodItemFactory();
            for (String line : foodLines) items.add(foodFactory.createItem(line));

            List<String> electronicLines = FileUtil.readFile("src/main/java/edu/neu/csye6200/ElectronicItemCSV.txt");
            Factory electronicFactory = ElectronicItemFactory.getInstance();
            for (String line : electronicLines) items.add(electronicFactory.createItem(line));

            List<String> serviceLines = FileUtil.readFile("src/main/java/edu/neu/csye6200/ServiceItemCSV.txt");
            Factory serviceFactory = ServiceItemFactory.getInstance();
            for (String line : serviceLines) items.add(serviceFactory.createItem(line));

            // Sorting by ID
            System.out.println("Sorted by ID:");
            items.sort(Comparator.naturalOrder());
            items.forEach(System.out::println);

            // Sorting by Name
            System.out.println("\nSorted by Name:");
            items.sort(Comparator.comparing(Item::getName));
            items.forEach(System.out::println);

            // Sorting by Price
            System.out.println("\nSorted by Price:");
            items.sort(Comparator.comparingDouble(Item::getPrice));
            items.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


//src/main/java/edu/neu/csye6200/FoodItemCSV.txt