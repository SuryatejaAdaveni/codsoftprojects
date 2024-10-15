import java.util.Scanner;

public class GradingSystem {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int subjects,j=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number of subjects.");
        subjects=scan.nextInt();
        int[] marks=new int[subjects];
        for(int i=0;i<subjects;i++){
            System.out.print("Enter "+(++j)+" Subject marks:");
            marks[i]=scan.nextInt();
        }
        int totalmarks=0;
        for(int i=0;i<subjects;i++){
            totalmarks+=marks[i];
        }
        double percentage=totalmarks/subjects;
        char grade;
        if(percentage>95){
            grade='O';
        }
        else if(percentage>90){
            grade='A';
        }
        else if(percentage>80){
            grade='B';
        }
        else if(percentage>70){
            grade='C';
        }
        else if(percentage>60){
            grade='D';
        }
        else if(percentage>50){
            grade='E';
        }
        else{
            grade='F';
        }

        System.out.println("Total marks :"+ totalmarks);
        System.out.println("Average percentage is :"+percentage+"%");
        System.out.println("Grade is :"+grade);
    }
}
