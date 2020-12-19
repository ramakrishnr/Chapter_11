public abstract class Vehicle {
    //fields
    private String powerSource;
    private int wheels;
    protected int price;

    //constructor
    public Vehicle(String powerSource, int wheels) {
        setPowerSource(powerSource);
        setWheels(wheels);
        setPrice();
    }

    //mutator
    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public abstract void setPrice();

    //accessor
    public String getPowerSource() {
        return powerSource;
    }
    public int getWheels() {
        return wheels;
    }
    public int getPrice() {
        return price;
    }
}