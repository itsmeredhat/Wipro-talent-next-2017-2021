class Alpha {
  public static void main(String[] args) {
  char ch1;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter character 1:");
  ch1=sc.next().charAt(0);
  if((ch1>='a' && ch1<='z')||(ch1>='A' && ch1<='Z'))
    {
        System.out.print("Entered character"+ ch1 + "is Alphabet");
    }
  else if(ch1>=48 && ch1<=57)
    {
        System.out.print("Entered character"+ ch1 + "isDigit");

    }
    
    else
    {
        System.out.print("Entered character"+ ch1 + "is special character");

    }
  }
  
  }