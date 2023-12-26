import java.util.Scanner;
 public class Student
 {
String USN;
String Name;
String Branch;
String Phone;
 void insertRecord(String usn,String 
name,String branch, String phone)
{
USN=usn;
Name=name;
Branch=branch;
Phone=phone;
}
void displayDetails()
{
System.out.println(USN+" "+Name+" "+Branch+" "+Phone);
}

public static void main(String args[])
{
Student s[]=new Student[100];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of students");
int n=sc.nextInt();
for (int i=0; i<n; i++)
{
s[i]=new Student();
for(int j=0; j<n; j++)
{
System.out.println("The deatails are");
String USN=sc.next();
String Name=sc.next();
String Branch=sc.next();
String Phone=sc.next();
s[j].insertRecord(USN,Name,Branch,Phone);
}
for(int m=0; m<n; m++)
{
s[m].displayDetails();
}
}
}
 }

