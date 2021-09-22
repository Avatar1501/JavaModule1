/*
Exp No 4

Create a class 'Student' with three data members
which are name, age and address.

The constructor of the class assigns default values name as "unknown", age as
'0' and address as "not available".

It has two members with the same name 'setInfo'.

First method has two parameters for name and age and assigns the same
whereas the second method takes has three parameters
which are assigned to name, age and address
respectively.

Print the name, age and address of 10 students. Hint - Use array of objects.

*/

import java.util.Scanner;

class Student {


    String name;
    int age;
    String address;

    public Student() {
        name = "unknown";
        age = 0;
        address = "not available";

    }



    public void setInfo(String name ,int age)
    {
        name = this.name;
        age = this.age;
    }

    public void setInfo(String name ,int age,String address)
    {
        name = this.name;
        age = this.age;
        address = this.address;
    }



    public static void main(String[] args) {
        Student[] s = new Student[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            s[i] = new Student();

            //System.out.println("Enter " + (i + 1) + " Student data :");

            System.out.print("Enter Student " +(i+1)+ " name : ");
            s[i].name = sc.next();
            System.out.print("Enter Student age : ");
            s[i].age = sc.nextInt();
            System.out.print("Enter Student Address : ");
            s[i].address = sc.next();

        }

        System.out.printf("%20s %10s %20s", "Name", "Age", "Address");
        System.out.println("\n====================================================\n");

        for (int i = 0; i < 10; i++) {

            System.out.println();
            System.out.format("%20s %10s %20s", s[i].name, s[i].age,s[i].address);
            System.out.println();


            //System.out.println( emp[i].name + "  " + emp[i].year + "  " + emp[i].address);

        }
    }
}