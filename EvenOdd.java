class EvenOdd {
  public static void main(String[] args) {
   
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter number 1:");
    int num1=sc.nextInt();
    
    if(num1%2==0)
      System.out.println("The number"+num1+"is even");
    else 
      System.out.println("The number"+num1+"is odd");
    
  }
}