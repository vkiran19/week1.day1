package week1.day1.classroom;

public class Primenumber {
	
public static void main(String[] args){
		
		int a=13;
		int i=1;
		int m=a/2;
		for (i=1;i<=m;i++){
			
			if (a%i == 0 && a%a == 0)
				System.out.println(a + "is  a prime number");
			break;
			
			
		}
	}

}
