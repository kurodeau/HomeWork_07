package hw8;

import java.math.BigInteger;
import java.util.*;

public class HW8_1 {
	
	public static void main(String[] args) {
		
		//依照題目宣告測試用Collection
		Collection list = new ArrayList();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(new Object());
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		//小題1.使用不同方式取出其中的元素並打印(Iterator, for, for-each)
		Iterator e1 = list.iterator();
		while( e1.hasNext() ){
			System.out.print( e1.next() + " " );
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		
		for( int i= 0; i< list.size(); i++){
			System.out.print( ((ArrayList) list).get(i) + " ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		
		for( Object e2 : list ){
			System.out.print( e2 + " ");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		
		//小題2.排除資料中不是java.lang.Number的內容
		Set<Number> listNumOnly = new HashSet();
		Iterator<Object> e3 = list.iterator();
		
		while( e3.hasNext() ){
			Object value = e3.next();
			if ( value instanceof Number ){
				listNumOnly.add( (Number) value );
			}
		}
		System.out.print( listNumOnly );
		
		
	}

}
