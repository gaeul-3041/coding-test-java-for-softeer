import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int score[] = new int[n];

        for(int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());

            double sum = 0;
            for(int j = left-1; j < right; j++) {
                sum += score[j];
            }

            double aver = sum / (double) (right - left + 1);
            String answer = String.format("%.2f", aver);
            System.out.println(answer);
        }
    }
}
