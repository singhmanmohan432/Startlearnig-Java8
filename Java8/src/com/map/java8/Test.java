package com.map.java8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Map hashMap = new HashMap<>();
		hashMap.put(101, "Manmohan");
		hashMap.put(102, "Singh");
		hashMap.put(103, "Hello");
		hashMap.put(105, "test");
		/*
		 * This is interview Question where they ask.
		 */
		System.out.println(hashMap.put(106, "Manmohan"));
		Set<Map.Entry<Integer, String>> tert = hashMap.entrySet();
		Iterator<Entry<Integer, String>> iterator = tert.iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			System.out.println(next.getValue() + "\t" + next.getKey());
		}

		/*
		 * This is the 2nd way to the print the map
		 */
		for (Entry<Integer, String> entry : tert) {
           System.out.println(entry.getKey()+""+entry.getValue());
		}

	}

}