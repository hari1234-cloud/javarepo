package JavaPractice;

public class RemoveJunk {

	public static void main(String[] args) {
		String s="@#*$#%@^#@#@Y@ latin String 021455855656";
		// Regular expression
		s=s.replaceAll("[^a-zA-Z0-9]","");

		System.out.println(s);
	}

}
