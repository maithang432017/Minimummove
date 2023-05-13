package O4;

public class MinimumMoves {
	public static void main(String[] args) {
		String letters = "aaabbbbb";
		System.out.println(minimumMoves(letters));
	}

	public static int minimumMoves(String letter) {
		int countMoves = 0;
		
		for (int i = 1; i < letter.length()-1; i++) {
			if(letter.charAt(i)==letter.charAt(i-1)&&letter.charAt(i)==letter.charAt(i+1)) {
				countMoves++;
				i++;
				
				
			}
		}return countMoves;
			
	}
}
