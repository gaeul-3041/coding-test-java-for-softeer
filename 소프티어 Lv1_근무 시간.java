import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int answer = 0;

        for(int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            String[] times = new String[2];

            for(int j = 0; j < 2; j++) {
                times[j] = st.nextToken();
            }

            int start = Integer.parseInt(times[0].substring(0, 2)) * 60 + Integer.parseInt(times[0].substring(3, 5));
            int end = Integer.parseInt(times[1].substring(0, 2)) * 60 + Integer.parseInt(times[1].substring(3, 5));
            answer += end - start;
        }

        System.out.println(answer);
    }
}
