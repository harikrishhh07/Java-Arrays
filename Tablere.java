import java.util.Scanner;
public class Tablere {
      public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  int[] mul=new int[4];
	  System.out.println("Enter the number");
	  int num=input.nextInt();
	  for(int i=0;i<4;i++){
	      mul[i]=num*(i+6);
	  }
	  for(int j=1;j<5;j++){
	  System.out.println(num +" * "+(j+5)+" = "+mul[j-1]);
	  }
	  input.close();
	  }
	  }