
import java.util.Scanner;

public class ArrayCC {
    public static void UpdateMarks(int marks[]){
        for(int i = 0 ; i<marks.length ; i++){
            marks[i] = marks[i]+1;
        }
    }

    public static void main(String[] args) {
        int marks[]={1,3,5};
        System.out.println("Before");
        for (int j = 0; j < marks.length; j++) {
            
            System.out.print(marks[j]+" ");
        }
        System.out.println("");
        UpdateMarks(marks);
        
        System.out.println("After");
        for (int j = 0; j < marks.length; j++) {
            
            System.out.print(marks[j]+" ");
        }
        // int[] marks = new int[100];
        // System.out.println("Enter the marks of PHY , CHEM , MATH respectivly");
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("Phy : " + marks[0]);
        // System.out.println("Chem : " + marks[1]);
        // System.out.println("Math : " + marks[2]);
        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("The percentage is " + percentage);

        // ######## Array passing to function call by reference #########
    }
}