package org.fujitsu.training.inner;

public class MyFilter {
	
	public static String[] filter(String[] a, Filter f) {
		for(int i = 0; i < a.length; i++) {
			if(f.accept(a[i])) {
				System.out.println(a[i]);
			}			
		}
		System.out.println();
		return null;
		
	}
}

interface Filter {
	boolean accept(String x);
}


