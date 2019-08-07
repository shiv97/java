public class OverL
{
public int Arith(int x, int y)
{
return (x+y);
}
public int Arith(int x, int y, int z)
{
 return (x-y+z);
}
public double Arith(double x,double y)
{
return (x+y);
}
public double Arith(int x, double y)
{
return (x+y);
}
    public static void main(String args[])
    {
        OverL s = new OverL();
        System.out.println("printing solution for int+int:");
        System.out.println(s.Arith(10, 20));
        System.out.println("printing solution for int-int+int:");
        System.out.println(s.Arith(10, 20, 30));
        System.out.println("printing solution for float+float:");
        System.out.println(s.Arith(10.5, 20.5));
        System.out.println("printing solution for float+int:");
        System.out.println(s.Arith(10, 20.3));
    }
}