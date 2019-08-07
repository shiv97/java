//method overriding
class pasta
{
    public void shape()
    {
       System.out.println("it is Penne pasta");
    }
    public static void main(String args[])
    {
        pasta a = new pasta();   // pasta object
        Pizza_hut b = new Pizza_hut();   // pasta reference but pizza_hut object

        a.shape();   // runs the method in pasta class
        b.shape();   // runs the method in pizzahut
        b.name();
        b.price();
    }
}
class Pizza_hut extends pasta
{
     public void shape()
     {
        System.out.println("it is Penne pizza pasta");
     }
     public void price()
     {
         int x=200;
         System.out.println("the cost is :" +x);
      }
     public void name()
     {
         System.out.println("Penne Arabita");
     }
}


