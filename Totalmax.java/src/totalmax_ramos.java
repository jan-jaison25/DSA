import java.util.Scanner;
import java.util.Random;
public class totalmax_ramos {
	public static void main(String[]args){
		
		int a, max = 0, size;
		int sum = 0;
		double ave;
		
		Scanner copy = new Scanner (System.in);
		System.out.println("Enter your size of Array: ");
		size = copy.nextInt();
		
			int numbers[] = new int [size];
			Random rand = new Random();
			
			for(a = 0; a < numbers.length; a++){
				numbers[a] = rand.nextInt(10);
			}
			
			for (a = 0; a<numbers.length; a++){
				System.out.print(numbers[a]+", ");
			}
			
			for(a = 0; a < numbers.length;a++){
				sum+=numbers[a];
			}
			
			System.out.println();
			System.out.println("Total = "+sum);
			ave = sum/numbers.length;
			System.out.println("Average = "+ave);
			
			for(a = 0; a< numbers.length; a++){
				if (max < numbers[a]+1){
					max = numbers[a];
				}
			}
			System.out.println("Max ="+ max);
	}
}
