package chap03Practice;

//내가 푼거 
public class C3Q03 {

	static void searchIdx(int[] a, int n, int key, int[] idx) {
		int i = 0;
		int k = 0;
		
		a[n] = key;
		
		while(true) {
			if(a[i] == key)
				idx[k] = key;
			if(i == n)
				break;
			i++;
		}
	}
	
	public static void main(String[] args) {
		int[] idxArr = {1, 9, 2, 9, 4, 6, 7, 9};
		int[] result = new int[idxArr.length];
		
		searchIdx(idxArr, idxArr.length, 9, result);
		
		for(int i = 0; i < result.length; i++)
		{
			System.out.println(result[i]);
		}
	}
}
