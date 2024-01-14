package Day15_String;

public class leftMost02Index {
	final static int CHARCOUNT = 256;
	public static int leftMost(String str) {
		
		boolean[] visited = new boolean[CHARCOUNT];
		int res = -1;
		for(int i=str.length()-1; i>0; i--) {
			
			boolean b = visited[str.charAt(i)];
			System.out.println(b);
			
			if(b) {
				res = i;
			}
			else {
				visited[str.charAt(i)] = true;
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcbagh";
		
		System.out.println(leftMost(str));

	}

}
