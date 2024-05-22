import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int stop1 = (int) Math.ceil(d / a);
        int stop2 = (int) Math.ceil(d / b);

        if(d % a == 0) stop1--;
        if(d % b == 0) stop2--;
        
        int answer = d + b * stop1 + d + a * stop2;
        System.out.println(answer);
    }
}
