package Barang;

public class barang {

    private Status status;
    private servicePackage servicePackage;
    private city city;
    private long weight;
    private long quantity;
    private long priceItem;
    private String productName;


    @Override
    public String toString() {
        return "Barang{"+productName+" | "+quantity+" | "+weight+" | "+
                city.getDestination()+" | "+servicePackage.getService()+" | "+
                servicePackage.getValue()+" | "+((priceItem*quantity)+servicePackage.getValue());
    }
    
    
}