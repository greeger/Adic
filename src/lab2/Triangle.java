package lab2;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void plusPlus(){
        a += 1;
        b += 1;
        c += 1;
    }

    public void minusMinus(){
        a -= 1;
        b -= 1;
        c -= 1;
    }

    public boolean isTriangle(){
        if(a <= 0 || b <= 0 || c <= 0 || a+b <= c || a+c <= b || b+c <= a)
            return false;
        return true;
    }

    public void multiply(double x){
        a *= x;
        b *= x;
        c *= x;
    }

    @Override
    public String toString(){
        return "a = " + a + ", b = " + b + ", c = " + c;
    }
}
