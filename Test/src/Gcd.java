import java.util.HashMap;
import java.util.Map;


public class Gcd {
	private static int first(int a, int b){
		//Added to check GIT annotations
		System.out.println("Added to check GIT annotations");
		if(b == 0){
			return a;
		} else{
			return second(b , a-b);
		}		
	}
	private static int second(int a, int b){
		if(a == 0){
			return b;
		} else{
			return first(b,a);
		}
	}
	public static void main(String[] args) {
//		System.out.println(first(5, 3));
		
		//===========
		Map<Key, Integer> map = new HashMap<>();
		Key firstKey  = new Key();
		map.put(firstKey, 0);
		for(int i=0; i< Integer.parseInt(args[0]);i++){
			map.put(new Key(), i);
		}
		map.get(firstKey);
	}
	
	//============================
	
	static class Key{

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return 42;
		}
		
	}
}
