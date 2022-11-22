package Day25_Classes;

import java.util.Scanner;

public class Topic2_IntroToClassesCont {
    public static void main(String[] args) {
        StudentRegistirationForm MyForm= new StudentRegistirationForm();
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Your Name : ");
        MyForm.Name=scan.nextLine();

        System.out.println("Please Enter Your Surname : ");
        MyForm.Surname=scan.nextLine();

        System.out.println("Please Enter Your age : ");
        MyForm.Age=scan.nextInt();

        System.out.println("Please Enter Your Gender : ");
        MyForm.Gender=scan.next();

        MyForm.PrintRegistirationForm();

    }
}

class StudentRegistirationForm{
    //Fields
    String Name;
    String Surname;
    int Age;
    String Gender;

    String School="RenasTech";

    void PrintRegistirationForm(){

        System.out.println("Please Enter Name : "+Name);
        System.out.println("Please Enter Surname : "+Surname);
        System.out.println("Please Enter Ager : "+Age);
        System.out.println("Please Enter Gender : "+Gender);

    }
}
