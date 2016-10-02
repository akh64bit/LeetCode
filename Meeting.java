package ungrouped;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Bus {
	String ID;
	int start;
	int end;

	public Bus(String ID, int start, int end) {
		this.ID = ID;
		this.start = start;
		this.end = end;
	}
}

public class Meeting {
	public static void main(String[] args) {
		Bus a = new Bus("a", 6, 9);
		Bus b = new Bus("b", 8, 10);
		Bus c = new Bus("c", 11, 12);
		Bus d = new Bus("d", 12, 14);
		Bus e = new Bus("e", 13, 15);
		Bus f = new Bus("f", 16, 17);
		List<Bus> bus = new ArrayList<>();
		bus.add(a);
		bus.add(b);
		bus.add(c);
		bus.add(d);
		bus.add(e);
		bus.add(f);
		System.out.println(bays(bus));
	}

	public static int bays(List<Bus> bus) {
		if (bus.size() == 0)
			return 0;
		int bay = 0;
		int[] startArray = new int[bus.size()];
		int[] endArray = new int[bus.size()];
		int len= bus.size();
		int ctr = 0;
		for (Bus b : bus) {
			startArray[ctr] = b.start;
			endArray[ctr] = b.end;
			ctr++;
		}
		Arrays.sort(startArray);
		Arrays.sort(endArray);
		int i=0,j=0;
		ctr=0;
		while(i<len && j<len)
		{
			if(startArray[i]<endArray[j])
			{
				ctr++;
				i++;
				bay= Math.max(bay,ctr);
				
			}else{
				ctr--;
				j++;
			}
		}
		 return bay;
	}
}
