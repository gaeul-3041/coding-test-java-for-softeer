import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int answer = 1;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] town = new int[n];
        int[] dist = new int[n-1];
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
    	    town[i] = Integer.parseInt(st.nextToken());
    	}

        for(int i = 0; i < n-1; i++) {
    	    dist[i] = town[i+1] - town[i];
    	}

        Arrays.sort(dist);

        for(int i = 0; i < n-2; i++) {
    	    if(dist[i+1] != dist[i]) {
                answer += i;
                break;
            }
    	}

        System.out.println(answer);
    }
}
