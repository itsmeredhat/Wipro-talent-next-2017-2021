class Positive {
  public static void main(String[] args) {
   
    Scanner sc= new Scanner (System.in);
    System.out.print("Enter number 1:");
    int num1=sc.nextInt();
    
    if(num1>0)
      System.out.println("The number"+num1+"is positive");
    else if(num1<0)
      System.out.println("The number"+num1+"is negative");
    else
      System.out.println("The number"+num1+"is equal to 0");
  }
}










