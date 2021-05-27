import java.io.*;
import java.util.Scanner;

class Student implements Serializable {
    int number;
    String name;
    int classs;

    Student(int number, String name, int classs) {
        this.number = number;
        this.name = name;
        this.classs = classs;
    }
    Student(int number, String name){
        this.number = number;
        this.name = name;
    }
    public void show(){
        System.out.println("Name : "+ name +"\nNumber : " + number + "Class : "+ classs);
    }
}

public class ObjectSerialization {
    public static void main(String [] args){

     Scanner sn = new Scanner(System.in);
     String response = "true";

     try {
         FileOutputStream fout = new FileOutputStream("trial.txt");
         ObjectOutputStream out = new ObjectOutputStream(fout);
         while(response.equals("true") || response.equals("yes")) {
             System.out.println("Enter Name Number and Class of a student in every new line. (respectively)");
             String name = sn.nextLine();
             int number = sn.nextInt();
             int classs = sn.nextInt();
             System.out.println("Values Entered :\nName : "+name +"\nClass :"+ classs + "\nNumber :" + number);
             System.out.println("\n\nMore values to feed ?");
             sn = new Scanner(System.in);
             response = sn.nextLine();
             response = response.toLowerCase();
             Student s3 = new Student(number, name, classs);
             out.writeObject(s3);
         }
         System.out.println("Thankyou!!");
         out.flush();
         out.close();
         System.out.println("Successful");

     }catch (IOException ie){
         System.out.println("Error Message : " +ie);
     }
    }
}
