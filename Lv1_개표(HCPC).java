import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int member = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < member; i++) {
            int num = Integer.parseInt(br.readLine());
            
            int a = num / 5;
            int b = num % 5;

            for(int j = 0; j < a; j++) {
                System.out.print("++++ ");
            }

            for(int j = 0; j < b; j++) {
                System.out.print("|");
            }

            System.out.println("");
        }
    }
}
