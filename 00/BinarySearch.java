import java.util.Scanner;

import javax.management.loading.MLet;

class BinarySearch {

	int binarySearch(int arr[], int x)
	{
		int l = 0;
		int r = arr.length -1;

		while (l <= r) {

			int m = l + (r-1)/2;

			if (arr[m] == x)
				return m;

			if(arr[m] < x)
				l = m + 1;
			else
				r = m - 1;
		}

		return -1;



	}

	public static void main(String args[]) {
		
		// Scanner in = new Scanner(System.in);

		// while ( in.hasNext() ) {

		// 	System.out.println(in.next());
		// }

		BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 2;
		int result = ob.binarySearch(arr, x);
		
		if (result != -1)
		 System.out.println("Je to - " + result);



	}

}

