public class VehicleCon {
    private String String1;
    private String String2;
    private int num3;
    private int num4;
    private int num5;

    public VehicleCon(String make, String model, int cityMPG, int hwyMPG, int listPrice) {
       String1 = make;
       String2 = model;
       num3 = cityMPG;
       num4 = hwyMPG;
       num5 = listPrice;

    }

    public String getMake() {
        return String1;
    }
}
