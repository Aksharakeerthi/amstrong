# amstrong
import java.io.*;
import java.util.*;
public class amstrong{
public static void main(String args[]){
int m=0,k,h,temp;
temp=h;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
h=sc.nextInt();
while(h>0){
k=h%10;
h=h/10;
m=m+(k*k*k);
}
if(temp==m){
System.out.println("The number is Amstrong");
}
else
System.out.println("The number is not a Amstrong");
}
}
