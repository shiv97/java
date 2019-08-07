package com.company;

public class icecream
{
    int cost;

    public icecream(String name)
    {
        System.out.println("flavour chosen is :" + name );
    }

    public void setCost( int price )
    {
        cost = price;
    }

    public int getCost( )
    {
        System.out.println("cost is :" + cost );
        return cost;
    }

    public static void main(String []args)
    {

        icecream ice= new icecream( "chocolate" );

        ice.setCost( 200 );
        ice.getCost( );
        System.out.println("Cost is :" + ice.cost );
        //object call
        Myice obj=new Myice("Missisipi_mud");
        //finalize k=new finalize();
        //k.finalize();
        pab ob= new pab();
        ob.eat();
        Amul_milk o=new Amul_milk();
        o.cream();
    }
}
class Myice
{
    //constructor example
    String icefl;
    //constructor initi
    Myice(String i)
    {
     icefl=i;
     System.out.println("my favorite flavour is:" +icefl);
    }
    public void finalize()
    {
        System.out.println("destructor called");
    }
}
//interface creating and using
interface ibaco
{
void eat();
}
class pab implements ibaco
{
public void eat()
{
System.out.println("ibaco has ice creams");
}
}
//abstract class creation
abstract class Amul
{
   final void cream()
   {
       System.out.println("Amul_Milk() is used, 100% cow's milk, pure icecream");
   }
}
class Amul_milk extends Amul
{
}
