import java.util.Scanner;
public class BinarySearch {
	public static void main(String[]args){
		int[]array = new int[10];
		int search = 0, index;
		
		System.out.println("Enter 10 numbers: ");
		Scanner input = new Scanner (System.in);
		
		for( int a = 0; a <array.length; a++){
			array[a] = input.nextInt(); 
		}
			System.out.print("enter number to find: ");
			search = input.nextInt();
			index = binarySearch(array, search);
			if( index != -1){
				System.out.println("FOUND at index" + index);
			}
			else{
				System.out.println("Not found!!");
			}
		}
	
		static int binarySearch(int[] numbers,int find){
			int left, right, middle;
			left = 0;
			right = numbers.length - 1;
			while (left <= right){
				middle = (left + right) / 2;
	
				if (numbers[middle]==find){
					return middle;
			}
				else if (numbers[middle] < find){
					left = middle + 1;
				}
				else{
					right = middle -1;
				}
			
		}
			return -1;
	}
}
