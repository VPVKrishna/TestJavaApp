import java.util.ArrayList;
import java.util.List;


public class Race {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(-2);
		list.add(5);
		list.add(-8);
		checkCase(list, 6);
		
		list.clear();
		list.add(1);
		list.add(5);
		list.add(-8);
		list.add(-3);
		list.add(-6);
		checkCase(list, 12);		
		
	}
	
	public static void checkCase(List<Integer> list, long output){
		long val = getToWin(list);
		if(val == output){
			System.out.println("Correct output :"+val);
		}else{
			System.out.println("Wrong output :"+val);
		}
		System.out.println("------------------------");
	}
	
	public static long getToWin(List<Integer> list){
		long res = list.get(0)>=0?0:-list.get(0);
		res=res+1;
		System.out.println("Assumed Value:"+res);
		while(!isValid(res, list)){
			res = res+1;
		}
		
		return res;
	}
	
	public static boolean isValid(long val, List<Integer> list){
		for(int item: list){
			val = val+item;
			if(val <=0){
				System.out.println("Failed At:"+item+"  Val:"+val);
				return false;
			}
		}
		System.out.println("Success:"+val);
		return true;
	}

}
