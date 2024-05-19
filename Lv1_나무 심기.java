import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] tree = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
		}
        
        Arrays.sort(tree);
        int answer = Math.max(tree[0] * tree[1], tree[n-2] * tree[n-1]);
        System.out.println(answer);
    }
}
