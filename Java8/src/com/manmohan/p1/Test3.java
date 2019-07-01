package com.manmohan.p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Test3 {

	
	public static void main(String[] args) {
		
		List<Integer> st=new ArrayList<>();
		st.add(1044);
		st.add(20);
		st.add(30);
		st.add(50);
		
		Iterator<Integer> iterator = st.iterator();
		
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println("Print Your No: \t"+integer);
			
		}
		
		Stream<Integer> stream = st.stream();
		//Optional<Integer> findFirst = stream.findFirst();
		//System.out.println(findFirst);
		//Optional<Integer> findAny = stream.findAny();
		//System.out.println("findany"+findAny);
		//System.out.println(stream.count());
		//System.out.println(stream.isParallel());
		//System.out.println(stream.skip(2).count());
		System.out.println("Stream api uses");
		stream.forEach(p->System.out.println("Hello :\t"+p));
		
		
		
	}
}
