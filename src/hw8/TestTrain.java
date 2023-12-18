package hw8;

import java.util.*;

import module18_20.MyComparator;

public class TestTrain {
	
public static void main(String[] args) {
		
		//實體化物件
		Collection<Train> train = new ArrayList();
		train.add( new Train(202, "普悠瑪", "樹林", "花蓮", 400) );
		train.add( new Train(1254, "區間", "屏東", "基隆", 700) );
		train.add( new Train(118, "自強", "高雄", "台北", 500) );
		train.add( new Train(1288, "區間", "新竹", "基隆", 400) );
		train.add( new Train(122, "自強", "台中", "花蓮", 600) );
		train.add( new Train(1222, "區間", "樹林", "七堵", 300) );
		train.add( new Train(1254, "區間", "屏東", "基隆", 700) );
	
		//題目一, 印出不重複的Train 物件, 使用Set 和迭代器
		Set<Train> setTrain = new HashSet();
		Iterator<Train> s1 = train.iterator();
		while( s1.hasNext() ) {
			setTrain.add( (Train)s1.next() );
		}
		Iterator<Train> tests1 = setTrain.iterator();
		while( tests1.hasNext() ) {
			System.out.println( tests1.next() );
		}
		System.out.println( "=================================================" );
		
		//???題目二, 印出可以按照大->小排序的所有 Train 物件, 使用ArrayList ,用for
		
		TrainComparator tC = new TrainComparator();
		PriorityQueue<Train> priorityQueueTrain = new PriorityQueue<Train>(3, tC);
		for( int i= 0; i< train.size(); i++ ) {
			priorityQueueTrain.offer( (Train)  (((ArrayList)train).get(i) ) );
		}
		while( priorityQueueTrain.size() != 0 ) {
			System.out.println( priorityQueueTrain.poll() );
		}
//		System.out.println( priorityQueueTrain );
		System.out.println( "=================================================" );
		
		//題目三, 印出不重複的Train 物件且按照車號大小排列, 使用TreeSet 和for-each
		Collection<Train> treeSettrain = new TreeSet();
		for ( Train t : train) {
			treeSettrain.addAll( train );
		}
//		System.out.println( treeSettrain );
		for ( Train t : treeSettrain) {
			System.out.println( t );;
		}
		
		
		
    }

}
