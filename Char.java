class Char {
  public static void main(String[] args) {
  char ch1,ch2;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter character 1:");
  ch1=sc.next().charAt(0);
  System.out.println("enter character 2:");
  ch2=sc.next().charAt(0);
  if(ch1>ch2)
  {
    System.out.println(ch2+","+ch1);
  }
  else{
   System.out.println(ch1+","+ch2);
  } 
  }
  
}
