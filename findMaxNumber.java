import java.util.*;

public class findMaxNumber{

	public static void main(String[] args) {
		int n,num,min=0,max=0;;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many numbers do you want to compare");
		n=sc.nextInt();
		
		System.out.println("Enter Numbers : ");
		for(int i=0;i<n;i++){
			num=sc.nextInt();

			if(i==0){
				min=num;
				max=num;
			}
			else{
				if(num<min){
					min=num;
				}
				if(num>max){
					max=num;
				}
			}
		}
		System.out.println("Min Number is " + min);
		System.out.println("Max Number is " + max);
	}
}