package assignment_22sept;

public class PrimeNumCount {
	
	public int getCount(int[] Arr)
	{
		int count=0;
		if(Arr.length==0) {
			throw new RuntimeException("Array length can not be zero");
		}
		for(int i=0;i<Arr.length;i++)
		{
			if(checkPrime(Arr[i])) {
				count++;
			}
		}
		return count;
		
	}

	public boolean checkPrime(int number)
	{
		int flag=0;
		if(number == 0 || number == 1) {
			
			return false;
		}
		for(int i=2; i<=Math.sqrt(number);i++) {
			if(number%i ==0 ) {
				flag = 1;
				break;
			}
		}
		if(flag==0) {
			return true;
		}
		else {
			return false;
		}
			
	}
}
