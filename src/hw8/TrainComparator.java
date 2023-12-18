package hw8;

import java.util.Comparator;

public class TrainComparator implements Comparator<Train>{
	
	public int compare(Train t1, Train t2) {
		
		if( t1.getNumber() > t2.getNumber() ) {
			return (1);
		}
		else {
			return (-1);
		}
		
	}
}


