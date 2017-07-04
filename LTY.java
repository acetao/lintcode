import java.util.*;

public class LTY {
	/*
	 * @param numbers : An array of Integer
	 * @param target : target = numbers[index1] + numbers[index2]
	 * @return : [index1 + 1, index2 + 1] (index1 < index2)
	 */
	public int[] twoSum(int[] numbers, int target) {
		// write your code here
		int[] result = new int[2];
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			map.put(numbers[i], i);		//key(元素)-value(元素下标)
		}
		for (int i = 0; i < numbers.length; i++) {
			int searched = target - numbers[i];
			if (map.containsKey(searched)) {
				result[0] = i + 1;
				Integer obj = (Integer)map.get(searched);
				result[1] = obj + 1;
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		LTY obj = new LTY();

		//int[] numbers = {2, 7, 11, 15};
		int[] numbers = {2, 15, 11, 7};
		int target = 9;
		numbers = obj.twoSum(numbers, target);
		System.out.println(numbers[0] + " " + numbers[1]);
	}
}
