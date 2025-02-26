
import java.util.Scanner;

class Person{

    private String name;
    private int age;


    public Person(String name,int age){

        this.name= name;
        this.age= age;
    }

    public void introduce(){
        System.out.println("My name is "+ name + "and my age is "+ age);

    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the name1: ");
        String name1=sc.nextLine();
        System.out.println("enter the name2: ");
        String name2 = sc.nextLine();
        System.out.println("Enter the age1");
        int age1=sc.nextInt();
        System.out.println("Enter the age2");
        int age2 = sc.nextInt();



        Person person1=new Person(name1,age1);
        Person person2 = new Person(name2,age2);


        person1.introduce();
        person2.introduce();


    }
}