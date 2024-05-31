package vaibhao.vk;

interface ArrayOperation{
	void acceptArray(int a[]);
	void PerformOperation();
}

class SortArray implements ArrayOperation{
	int arr[];
	@Override
	public void acceptArray(int[]a) {
		this.arr=a;
	}
	@Override
	public void PerformOperation() {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			for (int j = (i+1); j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Display the array after sort: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t",arr[i]);
		}
	}
}

class FindMax implements ArrayOperation{
	int[] arr;
	@Override
	public void acceptArray(int[]a) {
		// TODO Auto-generated method stub
		this.arr=a;
	}

	@Override
	public void PerformOperation() {
		// TODO Auto-generated method stub
		
	}
	
}
public class DyanamicPoluApplication {

	public static void main(String[] args) {
		
	}

}
