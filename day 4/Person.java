public class Person{
    
        String name;
        public Person(String ne)
        {
           public void setName(String)
            {
                name=ne;
            }
            public String getName()
            {
                return name;
            }
            public String toString()
            {
                return name;
            }
    }
}
class Employee extends Person{
    super(ne);
        double annual_salary;
        int start_year;
        String national_no;
    public Employee(String ne,double a,int yr,String n)
    { 
        void setSalary(double){
            annual_salary=a;
        }
        void setYear(int){
            start_year=yr;
        }
        void setNumber(String){
            national_no=n;
        }
        public double getSalary(){
            return annual_salary;
        }
        public int getYear(){
            return start_year;
        }
        public double getNumber(){
            return natonal_no;
        }
        public String toString()
        {
            return super.toString()+""+annual_salary+""+start_year+""national_no;
        }
}
class TestEmployee{
    Person p =new Person("Bob");
    Employee e= new Employee("Alice","25000","2018","qwer");
    System.out.println(p);
    System.out.println(e);
}


