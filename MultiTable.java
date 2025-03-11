import java.util.Scanner;
public class MultiTable {
      public static void main(String[] args) {
	  Scanner input=new Scanner(System.in);
	  int[] mul=new int[10];
	  System.out.println("Enter the number");
	  int num=sc.nextInt();
	  for(int i=0;i<10;i++){
	      mul[i]=num*(i+1);
	  }
	  for(int j=1;j<11;j++){
	  System.out.println(num +" * "+j+" = "+mul[j-1]);
	  }
	  input.close();
	  }
	  }