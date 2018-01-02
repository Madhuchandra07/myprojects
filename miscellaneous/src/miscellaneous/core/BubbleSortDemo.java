package miscellaneous.core;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int [] a={10,20,90,5,2,62,6};
		System.out.println("Array before bubble sort");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		bubbleSortMethd(a);
		System.out.println("Arry after bubble sorting");
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+"  ");
	}

	}


private static void bubbleSortMethd(int[] a) {
	int temp=0,n;
	n=a.length;
	for(int i=0;i<n;i++){
		for (int j=1;j<(n-i);j++){
			if (a[j-1]>a[j]){
				temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			}
		}
	}
		
		
	}



}