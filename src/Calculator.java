public class Calculator
{

    Calculator()
    {

    }

    public int add(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    public int subtract(int a, int b)
    {
        int difference = a - b;
        return difference;
    }

    public int multiply(int a, int b)
    {
        int product = a * b;
        return product;
    }

    public int divide(int a, int b)
    {
        int quote = a/b;
        return quote;
    }

    public int modulo(int a, int b)
    {
        int mDiffrence = a%b;
        return mDiffrence;
    }

    public static void main(String[] args)
    {
        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.subtract(45,11));
    }


}