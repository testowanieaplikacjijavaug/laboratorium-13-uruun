package jbehave;

public class QuadraticFunction {

    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;

    public void setA(double value)
    {
        a = value;
    }
    public void setB(double value)
    {
        b = value;
    }
    public void setC(double value)
    {
        c = value;
    }
    public double getX1() {
        return x1;
    }
    public double getX2() {
        return x2;
    }

    public void calculate()
    {
        if(a == 0)
        {
            if (b != 0)
            {
                x1 = x2 = -c / b;
                return;
            }
            else
                throw new IllegalArgumentException("");
        }
        final double delta = b * b - 4 * a * c;
        if (delta > 0)
        {
            x1 = (-b - Math.sqrt(delta)) / (2 * a);
            x2 = (-b + Math.sqrt(delta)) / (2 * a);
        }
        else if (delta == 0) {
            x1 = x2 = -b / (2 * a);
        }
        else {
            throw new IllegalArgumentException();
        }
    }
}