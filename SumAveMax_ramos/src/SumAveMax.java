import java.util.Scanner;
import java.util.Random;
public class SumAveMax {
	
	private int sum, max, size, array[];
	private float average;
	public SumAveMax(){
		
		Scanner input = new Scanner (System.in);
		Random rand = new Random();
		System.out.print("Enter array size: ");
		size = input.nextInt();
		array = new int[size];
		System.out.print("Random"+ size + " numbers:");
		
		for(int a = 0; a< size; a++){
			array[a] = rand.nextInt(100);
			System.out.print(array[a]+ " ");
			sum += array[a];
			
			if(array[a] > max)
				max = array[a];
		}
		System.out.println();
		
	}
	public void getsum(){
		System.out.println("sum= "+sum);
		
	}
	public void getMax(){
		System.out.println("max= "+max);
	}
	public void getaverage(){
		average = (float) sum / size;
		System.out.println("Ave= "+average);
	}
	public static void main(String[]args){
		
		SumAveMax demo = new SumAveMax();
		
		demo.getsum();
		demo.getMax();
		demo.getaverage();
		
	}
}	
