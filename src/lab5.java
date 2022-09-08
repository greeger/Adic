public class lab5 {
    static double getPerimeter(double a, double b, double c) throws IllegalArgumentException{
        if (a <= 0 || b <= 0 || c <= 0 || a+b <= c || a+c <= b || c+b <= a)
            throw new IllegalArgumentException(a + ", " + b + ", " + c + " не являются сторонами треугольника!");
        return a+b+c;
    }

    public static void main(String[] args){
        try{
            System.out.println(getPerimeter(1, 2, 3));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
