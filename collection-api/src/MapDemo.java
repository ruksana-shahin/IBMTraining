import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, String> map=new HashMap<>();
		map.put("jack", "jill");
		map.put("scott", "tiger");
		map.put("polo","lili");
		
		System.out.println("iteratig hashmap..");
		for(Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" :"+m.getValue());
		}
		
//		System.out.println("scott:"+map.get("scott"));
//		System.out.println("polo:"+map.get("polo"));
//		System.out.println("jack:"+map.get("jack"));
		}

}
