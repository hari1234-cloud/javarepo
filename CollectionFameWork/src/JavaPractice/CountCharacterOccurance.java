package JavaPractice;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		
		String s = "Java Programming Java Opps";
		
		int total_count=s.length(); // total length
		
		int totalcount_afterRemove=s.replace("j","").length(); // after remove a's
		
		int count =total_count-totalcount_afterRemove;
		
		System.out.println("Number of Occurances a is:" +count);

	}

}
