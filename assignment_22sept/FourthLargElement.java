package assignment_22sept;

import java.util.Arrays;

public class FourthLargElement {

	public int getFourthLargest(int[] Arr, int index) {
		try {
			if (index > Arr.length) {
				throw new NegativeArraySizeException("Index value cannot be negative");
			}
			if (Arr.length < index) {
				return 0;
			}
			Arrays.sort(Arr);
			return Arr[Arr.length - index];
		} catch (NegativeArraySizeException e) {
			e.getMessage();
		}
		return 0;
	}

}