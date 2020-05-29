public class Student
{
 public String myName ; 
 public int myAge; 
 public String myGender; 
 
 	public Person(String name, int age, String gender)
	{
 	myName = name;
	 myAge = age;
 	myGender = gender;
	 }

 	public String getName()
	{
 		return myName;
 	}

	public int getAge()
	{
 		return myAge;
	 }
	 public String getGender()
	{
	 return myGender;
	 }
	 public void setName(String name)
	{
 	myName = name;
 	}
	 public void setAge(int age)
	{
	 myAge = age;
 	}
	 public void setGender(String gender)
	{
	 myGender = gender;
 	}
 	public String toString()
	{
 	return myName + ", age: " + myAge + ", gender: " +myGender;
	}
}
public class Student extends Person
{
public String myIdNum; 
public double myGPA; 

public Student(String name, int age, String gender,String idNum, double gpa)
{

	super(name, age, gender);

	myIdNum = idNum;
	myGPA = gpa;
}
public String getIdNum()
{
return myIdNum;
}
public double getGPA(){
return myGPA;
 }
public void setIdNum(String idNum)
{
myIdNum = idNum;
}
public void setGPA(double gpa)
{
myGPA = gpa;
}

public String toString()
{
return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA;
}
}