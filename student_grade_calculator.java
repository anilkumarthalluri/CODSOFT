package CODSOFT;

import java.util.*;

public class student_grade_calculator {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int n,i,total=0;
            float avg;
            char grade;
            int[] marks = new int[100];
            System.out.print("number of subjects you have : "); 
            n=sc.nextInt();
            for(i=1;i<=n;i++){
                System.out.print("marks in subject "+i+" : ");
                marks[i]=sc.nextInt();
            }
            for(i=1;i<=n;i++){
                total+=marks[i];
            }
            avg=total/n;
            if(avg>90){
                grade='A';
            }
            else if(avg>80){
                grade='B';
            }
            else if(avg>70){
                grade='c';
            }
            else if(avg>60){
                grade='D';
            }
            else if(avg>50){
                grade='E';
            }
            else{
                grade='F';
            }
            System.out.println("\t\t\t----------Your Result----------");
            System.out.println("Total Marks : "+total);
            System.out.println("Percentage : "+avg);
            System.out.println("Grade : "+grade);
        }
    }
}