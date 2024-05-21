import java.util.Scanner;

public class File {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         if(n%2==0){
            System.out.println("Enter the of"+" "+n +" "+"is : Even");
         }
         else{
            System.out.println("Enter the of"+" "+n +" "+"is : Odd");
         }


    }
}