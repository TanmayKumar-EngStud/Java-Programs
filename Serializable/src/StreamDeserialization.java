import java.io.FileInputStream;
import java.util.Scanner;
import java.io.*;

public class StreamDeserialization {
    public static void main(String[] args) {

        System.out.println("Want to get back the given information?\n");
        Scanner sn = new Scanner(System.in);
        String response = sn.nextLine();
        response = response.toLowerCase();
        try {
            if (response.equals("yes") || response.equals("true")) {

                FileInputStream input = new FileInputStream("trial.txt");
                ObjectInputStream inp = new ObjectInputStream(input);

                try {
                    while(true) {
                        Student s1 = (Student) inp.readObject();
                        System.out.println("Data recieved : \nName : " + s1.name + "\nClass : " + s1.classs + "\nNumber : " + s1.number);
                    }
                }catch(Exception e){
                    System.out.println("\n");
                }


            } else {

                System.out.println("Thankyou for your response!!\n");
                System.out.println("Good bye!!");

            }
        }catch(Exception e){
            System.out.println("Error Message: \t"+ e);
        }
    }
}
