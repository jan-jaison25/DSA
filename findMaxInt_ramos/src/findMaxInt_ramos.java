import java.util.Scanner;
public class findMaxInt_ramos {
	public static void mian(String[]args){
		int[] numbers = {1, 5, 9, 10, 11};
		

		
		for (int i = 0; i < numbers.length ; i++){
			System.out.print(numbers[i]+ ", ");
		}
		
		int total = 0;
		for(int i = 0; i <numbers.length ; i++){
			total = total + numbers[i];
		}

		System.out.println("Total = "+ total);

	
		double average = total / numbers.length ;
		System.out.println("Total = "+ total);
		System.out.println("Total = "+ average);
		
		
		int max = numbers[0];
		for(int i = 0; i < numbers.length; i++)
			if(numbers[i] > max)
				max = numbers[i];
		System.out.println("Max ="+ max);
	}
}
