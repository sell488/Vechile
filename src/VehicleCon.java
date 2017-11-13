public class VehicleCon {
    private String String1;
    private String String2;
    private int num3;
    private int num4;
    private int num5;

    public VehicleCon(String make, String model, int cityMPG, int hwyMPG, int ListPrice) {
       String1 = make;
       String2 = model;
       num3 = cityMPG;
       num4 = hwyMPG;
       num5 = ListPrice;

    }

    public String getMake() {
        return String1;
    }

    public String getModel() {
        return String2;
    }

    public int getCityMPG() {
        return num3;
    }

    public int getHwyMPG() {
        return num4;
    }

    public int getListPrice() {
        return num5;
    }
}
