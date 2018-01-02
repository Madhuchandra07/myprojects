package creativity;

public class DeletingDuplicates {

	public static void main(String[] args) {
		int[] x={10,20,30,10,40,50,40};
		int size = x.length;
		System.out.println("The size of array before deletion :"+size);
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
			if(x[i]==x[j]){
				while(j<size-1){
					x[j] = x[j + 1];
					j++;
				}
				size--;
			}
				
			}
		}
		System.out.println("Size After deletion: " + size);
		System.out.println("Final output");
		 
        for (int k = 0; k < size; k++) 
        {
            System.out.println(x[k]); // printing the values
        }
	}

}
