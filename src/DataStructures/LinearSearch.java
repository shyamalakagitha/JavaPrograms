package DataStructures;

public class LinearSearch 
{
	//Logic:
	//Start Traversing from Leftmost Element of array[] and One by One
	//Compare X value with each element of array[].
	
	//If X value matches with an element, it will return Index.
	//If X value does not match with any element, it will return -1.
	
	//Time Complexity of this program is O(n).
	public static int linearSearch(int array[], int x)
	{
		int number = array.length;
		for(int i=0; i<number; i++)
		{
			if(array[i] == x)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int array[] = {12, 45, 10, 98, 45};
		int x = 98;
		
		int result = linearSearch(array, x);
		if(result == -1)
			System.out.println("Element is not Present in Array : " +result);
		else
			System.out.println("Element is not Present at Index : " +result);
	}
}