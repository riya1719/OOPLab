package Practice;

public class MiniElementfromGiveninArray {
	
	
	
	public static void main(String[] args) {
		
		
		int array []= {1,2,3,3,3,6,8,9};
		
		int key = 3;
		
		int prev = 0;
		
		
		int low  = 0, high = array.length-1;//6
		
		while( low <= high)
		{
		int mid = (low+high) /2;
		
			
			if (array[mid] < key)
			low = mid+1;
			
			
			else if(array[mid] > key)
			high = mid - 1;

			else if (array[mid] == key)
			{
				if (prev < mid)
				{
					prev = mid;
				}
				low = mid+1;	
				//System.out.println(prev+ " prev");

				
			}
			
		}
		System.out.println(prev);

		
		

	}

}
