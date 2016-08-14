package leetcode_algorithms;

public class CheckSubString {
	public static void main(String[] args) {
		System.out.println("-----");
		// Solution383 s =new Solution383();
		System.out.println(canConstruct("aa", "aab"));
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() == 0 || ransomNote.equals(magazine)) {
			return true;
		} else if (ransomNote.length() > magazine.length()) {
			return false;
		} else {
			for (int i = 0; i < magazine.length() - ransomNote.length(); i++) {
				while (ransomNote.equals(magazine.substring(i,
						i + ransomNote.length()))) {
					return true;
				}
			}
			return false;
		}
	}

}
