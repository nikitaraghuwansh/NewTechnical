//Through the scanner,we took the user's name and marks of five subjects and aggregated them and then the grade came out.


import java.util.Scanner;
public class StudentResult
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Please Enter Your Name");
String name=sc.next();

System.out.println("Enter the marks of Physics:");
int phy=sc.nextInt();

System.out.println("Enter the marks of Chemistry:");
int che=sc.nextInt();

System.out.println("Enter the marks of Methametics");
int meth=sc.nextInt();

System.out.println("Enter the marks of English:");
int eng=sc.nextInt();

System.out.println("Enter the marks of Hindi:");
int hin=sc.nextInt();

int Total=phy+che+meth+eng+hin;
System.out.println("Your total marks is:"+Total);
int avg=Total/5;
System.out.println("Your Avarage is:"+avg);

if(avg>=90)
{
System.out.println("Your Grade is A+");
}

else if(avg>=85)
{
System.out.println("Your Grade is A");
}

else if(avg>=75)
{
System.out.println("Your Grade is B");
}

else if(avg>=60)
{
System.out.println("Your Grade is C");
}

else if(avg>=50)
{
System.out.println("Your Grade is D");
}
else if(avg>=40)
{
System.out.println("Your Grade is E");
}

else if(avg>=33)
{
System.out.println("Your Grade is F");
}

else if(avg<33)
{
System.out.println("Your Grade is G");
}
else
{
System.out.println("Please check again");
}
}
}