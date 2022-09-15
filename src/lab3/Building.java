package lab3;

public class Building {
    private HeatingSystem heatingSystem;
    private int temperature;
    public Building(HeatingSystem heatingSystem, int temperature){
        this.heatingSystem = heatingSystem;
        this.temperature = temperature;
    }

    public HeatingSystem getHeatingSystem() {
        return heatingSystem;
    }

    public void setHeatingSystem(HeatingSystem heatingSystem) {
        this.heatingSystem = heatingSystem;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
     @Override
    public String toString(){
        return "Температура в здании " + temperature + " градусов. " + heatingSystem;
     }
}
