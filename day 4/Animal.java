

class Animal
{
  public  Animal()
  {
    System.out.println("A");
  } 
  void eat()
  {
    System.out.println("EAT");
  }
  void sleep()
  {
    System.out.println("SLEEP");
  }
}
class Bird extends Animal
{
    public Bird()
    {
      System.out.println("B");
    }
    @Override
  
    void eat()
  {
    System.out.println("B.EAT");
  }
  void sleep()
  { 
    System.out.println("B.SLEEP");
  }
    void fly()
    {
      System.out.println("B.FLY");
    }

}
class Animal
{
  public static void main(String args[])
  {
    Animal a=new Animal();
    Bird b= new Bird();
    a.eat();
    a.sleep();
    b.eat();
    b.sleep();
    b.fly();
  }
}


