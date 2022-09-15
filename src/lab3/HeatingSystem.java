package lab3;

public class HeatingSystem {
    private boolean working;
    private boolean filled;

    public HeatingSystem(boolean working, boolean filled){
        this.working = working;
        this.filled = filled;
    }

    public boolean isWorking() {
        return working;
    }

    public void enable() {
        this.working = true;
    }

    public void disable() {
        this.working = false;
    }

    public boolean isFilled() {
        return filled;
    }

    public void fill() {
        this.filled = true;
    }

    public void unfill() {
        this.filled = false;
    }

    @Override
    public String toString(){
        return "Отопительная система " + (working? "работает" : "не работает") +
                ". Система " + (filled? "заполнена." : "не заполнена.");
    }
}
