import java.util.Scanner;

public class first{
public static void main(String args[]){
int n;
Scanner scan=new Scanner(System.in);
n= scan.nextInt();

if(n>0){
System.out.println("Positive");
}
if(n<0){
System.out.println("Negative");
}
if(n==0){
System.out.println("Zero");
}

}
}
