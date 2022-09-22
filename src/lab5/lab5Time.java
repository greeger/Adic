package lab5;

public class lab5Time {
    static int getSeconds(int hours, int minutes) throws IllegalArgumentException{
        if (hours < 0 || minutes < 0)
            throw new IllegalArgumentException("Время не может быть отрицательным!");
        return hours*3600 + minutes*60;
    }

    public static void main(String[] args){
        try{
            System.out.println(getSeconds(2, 13));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
