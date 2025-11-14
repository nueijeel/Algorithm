import java.io.*;
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			sb.append("#").append(test_case).append(" ");
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<Integer> list = new ArrayList<Integer>() ;
			for (int j = 0; j < 10; j++) {
				int num = Integer.parseInt(st.nextToken());
				list.add(num);
			}
			Collections.sort(list);
			sb.append(list.get(9)).append("\n");
		}
        System.out.println(sb);
	}
}