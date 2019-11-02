import java.util.ArrayList;
import java.util.List;

public class Race_2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.clear();
		list.add(Integer.MIN_VALUE);
		list.add(Integer.MIN_VALUE);
		/*list.add(-2);
		list.add(3);
		list.add(1);
		list.add(-1);
		list.add(-6);
		list.add(-1);
		list.add(0);
		list.add(5);;*/
		checkCase(list, 8);
		/*
		list.clear();
		list.add(-5);
		list.add(4);
		list.add(-2);
		list.add(3);
		list.add(1);
		
		checkCase(list, 6);*/
		
//		list.clear();
//		list.add(5);
//		checkCase(list, 1);
//		
//		list.clear();
//		list.add(-4);
//		checkCase(list, 5);
//		
//		list.clear();
//		list.add(-2);
//		list.add(5);
//		list.add(-8);
//		checkCase(list, 6);
//
//		list.clear();
//		list.add(1);
//		list.add(5);
//		list.add(-8);
//		list.add(-3);
//		list.add(-6);
//		list.add(9);
//		checkCase(list, 12);

	}

	public static void checkCase(List<Integer> list, long output) {
		System.out.println(list);
		long val = getToWin(list);
		if (val == output) {
			System.out.println("Correct output :" + val);
		} else {
			System.out.println("Wrong output :" + val);
		}
		System.out.println("--------------------------------");
	}

	public static long getToWin(List<Integer> list) {
		long res = list.get(0) >= 0 ? 0 : -list.get(0);
		res = res + 1;
		System.out.println("Assumption Value:" + res);
		while (true) {
			long val = isValid(res, list);
			if (!(val <= 0)) {
				break;
			}

			res = res + -val + 1;
			System.out.println("Reassumption Value:" + res);
		}

		return res;
	}

	public static long isValid(long val, List<Integer> list) {
		for (int item : list) {
			val = val + item;
			if (val <= 0) {
				System.out.println("Failed At:" + item + "  Val:" + val);
				return val;
			}
		}
		System.out.println("Success:" + val);
		return val;
	}

}











