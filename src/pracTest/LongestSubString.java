package pracTest;

public class LongestSubString {

	static int LCSubStr(char[] X, char[] Y, int m, int n) {
		// Create a table to store lengths of longest common suffixes of
		// substrings. Note that LCSuff[i][j] contains length of longest
		// common suffix of X[0..i-1] and Y[0..j-1]. The first row and
		// first column entries have no logical meaning, they are used only
		// for simplicity of program
		int LCStuff[][] = new int[m + 1][n + 1];
		int result = 0;// To store length of the longest common substring
		// Following steps build LCSuff[m+1][n+1] in bottom up fashion
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					LCStuff[i][j] = 0;
				} else if (X[i - 1] == Y[j - 1]) {
					LCStuff[i][j] = LCStuff[i - 1][j - 1] + 1;
					result = Integer.max(result, LCStuff[i][j]);
				} else {
					LCStuff[i][j] = 0;
				}
			}
		}
		return result;
	}

	static int lcs(String X, String Y, int m, int n, int count) {
		if (m == 0 || n == 0) {
			return count;
		}

		if (X.charAt(m - 1) == Y.charAt(n - 1)) {
			count = lcs(X, Y, m - 1, n - 1, count + 1);
		}
		count = Math.max(count, Math.max(lcs(X, Y, m, n - 1, 0), lcs(X, Y, m - 1, n, 0)));
		return count;
	}

	public static void main(String[] args) {
		String X = "Oldsite:GeeksforGeeks.org";
		String Y = "Newsite:GeeksQuize.com";
		int m = X.length();
		int n = Y.length();
		int ans = LongestSubString.LCSubStr(X.toCharArray(), Y.toCharArray(), m, n);
		System.out.println(ans);
		int ans1 = LongestSubString.lcs(X, Y, m, n,0);
		System.out.println(ans1);

	}

}
