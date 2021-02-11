import java.util.Scanner;

public class NewSort 
{
	static void sort_selection(int arr[], int size) 
	{
		for (int i=0; i<size-1; i++) 
		{
			int index = i;
			
			for (int j=i+1; j<size; j++) 
			{
				if (arr[j] < arr[index]) 
				{
					index = j;
				}
			}
			
			int temp =  arr[index];   
            arr[index] = arr[i];  
            arr[i] = temp;
		}
	}
	

	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		
		//taking the length of the array as input
		System.out.print("Enter the total number of elements in the array to be sorted");
		int total_elements = sc.nextInt();
		
		//defining an array to store all the elements
		int array[] = new int[total_elements];
		
		//taking elements of the array as input
		System.out.print("Enter the elements of the array to be sorted");
		
		for (int i=0; i<total_elements; i++) 
		{
			array[i] = sc.nextInt();
		}
		
		//printing the original array
		System.out.print("Original array:\n");
		
		for (int j=0; j<total_elements; j++) 
		{
			System.out.print(array[j] +" ");
		}
		
		//calling function to sort the array
		sort_selection(array,total_elements);
		
		//printing the sorted array
		System.out.print("\nSorted array:\n");
		
		for (int j=0; j<total_elements; j++) 
		{
			System.out.print(array[j] +" ");
		}
	
	}

}