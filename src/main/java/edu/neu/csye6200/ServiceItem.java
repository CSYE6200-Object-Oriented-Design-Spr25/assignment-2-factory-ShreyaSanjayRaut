package edu.neu.csye6200;

class ServiceItem extends Item {

    public ServiceItem(String csv) {
        super((int)parseCSV(csv)[0], (String)parseCSV(csv)[1], (double)parseCSV(csv)[2]);
    }
    private static Object[] parseCSV(String csv) {
        String[] values = csv.split(",");
        return new Object[]{Integer.parseInt(values[0]), values[1], Double.parseDouble(values[2])};
    }
    @Override
    public String toString() { return "ServiceItem: " + id + ", " + name + ", " + price; }

}