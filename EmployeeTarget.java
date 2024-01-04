package leetcode;

public class EmployeeTarget {
	
	public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
		int out = 0;
		for(int i=0; i<hours.length; i++) {
			if(hours[i]>=target) {
				out++;
			}
		}
		return out;
	}
	
	public static void main(String[] args) {
		int[] hours = {0,1,2,3,4};
		int target = 2;
		
		System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
	}
}
