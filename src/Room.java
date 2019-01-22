public class Room {
    private double size;
    private int temperature;
    private boolean airConditioner;

    public Room(double size, int temperature, boolean airConditioner) {
        this(size, airConditioner);
        this.temperature= temperature;
    }

    public Room(double size, boolean airConditioner) {
        this.size= size;
        this.airConditioner = airConditioner;
    }

    private final double minTemp = 16;
    public boolean decrease() {
        if ((airConditioner) && (temperature > minTemp)) {
            temperature--;
            return true;
        } else {
            return false;
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }
}
