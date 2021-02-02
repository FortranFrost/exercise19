package org.fujitsu.training.inner;

public class TestMyFilter {

	public static void main(String[] args) {
		
		String[] test = {"rig", "rights", "madam", "racecar", "1love", "surpass", "stress", "recess", "jar", "2lack"};


			
		Filter f1 = new Filter() {

			@Override
			public boolean accept(String x) {
				if(x.length() <= 3) {
					return true;
				}
				return false;
			}
		};	
		
		
		Filter f4 = new Filter() {

			@Override
			public boolean accept(String x) {
				if(Character.isDigit(x.charAt(0))) {
					return true;
				}
				return false;
			}			
		};
		
		Filter f5 = new Filter() {

			@Override
			public boolean accept(String x) {
				if(x.length() % 2 == 0) {
					return true;
				}
				return false;
			}			
		};
		
		MyFilter.filter(test, f1);
		MyFilter.filter(test, f4);
		MyFilter.filter(test, f5);
	}
	


}
