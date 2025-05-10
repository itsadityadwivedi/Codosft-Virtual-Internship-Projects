import java.util.*;

public class Studentgrade {

    public static void calculate(int s1, int s2, int s3, int s4, int s5){

        //calculating totalmarks
        int totalmarks = s1+s2+s3+s4+s5;
        System.out.println("Total marks obtained"+ "="+ totalmarks);

        //calculating average marks
        int avgmarks = (s1+s2+s3+s4+s5)/5;
        System.out.println("Average marks obtained"+ "="+ avgmarks);


        //calculating grade

        if (avgmarks<=100 && avgmarks>90) {
           System.out.println("Grade obtained" + " = " + "A+");
        }
        else if (avgmarks<=90 && avgmarks>80) {
            System.out.println("Grade obtained" + " = " + "A");

        }
        else if (avgmarks<=80 && avgmarks>70) {
            System.out.println("Grade obtained" + " = " + "B+");

        }
        else if (avgmarks<=70 && avgmarks>60) {
            System.out.println("Grade obtained" + " = " + "B");

        }
        else if (avgmarks<=60 && avgmarks>50) {
            System.out.println("Grade obtained" + " = " + "C+");

        }
        else if (avgmarks<=50 && avgmarks>40) {
            System.out.println("Grade obtained" + " = " + "C");

        }
        else{
            System.out.println("Grade obtained" + " = " + "C#");
        }
        

    }
    public static void main(String[] args) {

        System.out.println("** Student Grade Calculator **");

        System.out.println("Enter your 5 subjects mark one by one ");
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Subject 1 : ");
        int s1 = sc.nextInt();
        System.out.print("Subject 2 : ");
        int s2 = sc.nextInt();
        System.out.print("Subject 3 : ");
        int s3 = sc.nextInt();
        System.out.print("Subject 4 : ");
        int s4 = sc.nextInt();
        System.out.print("Subject 5 : ");
        int s5 = sc.nextInt();
        sc.close();
        calculate(s1, s2, s3, s4, s5);        
    }
}