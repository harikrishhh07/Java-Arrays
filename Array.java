import java.util.Scanner;
public class Array{
      public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  double[] number=new double[10];
	  double num=0.0;
	  int n=0;
	   while(true){
	   System.out.println("Enter the number");
	   num=input.nextDouble();
	   if(num<0.00){
	     break;
	   }
	   else if(n>9){
	   break;
	   }
	   else {
	   number[n]=num;
	   }
	   n++;
	   }
	   double sum=0;
	   for(int i=0;i<10;i++){
	   sum+=number[i];
	   }
	   System.out.println("sum of the element of the array is "+sum);
	   input.close();
	   }
	   }