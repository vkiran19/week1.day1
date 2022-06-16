package week1.day1.classroom;

public class FibonacciSeries {
	
public static void main(String[] args){
		
		int range=8;
		int firstnum=0;
		int secnum=1;
		int sum;
		
		{
			System.out.println("the first numbers are " + 0 + 1);
		}
		
		for (int i=2;i<range;i++)
		{
			sum=firstnum+secnum;
			System.out.println("number is" + sum);
			firstnum=secnum;
			secnum=sum;
		}
	}

}
