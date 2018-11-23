import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
  /**
   * Iterate through each line of input.
   */
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
        String[] cur = line.split(" ");
        int[] seen = new int[9];
        for (String i : cur) {
        	seen[Integer.valueOf(i)-1] ++;
        }
        boolean hasValue = false;
        for (int i : seen) {
        	if (i == 1) {
        		for (int j = 0; j < cur.length; j++) {
        			if (Integer.valueOf(cur[j]) == i) {
        				System.out.println(j+1);
        				hasValue = true;
        				break;
        			}
        		}
        	    if (hasValue == true) {
                    break;
                }
        	}
        }
        if (hasValue == false) {
        	System.out.println(0);
        }
        System.out.println(line);
    }
  }
}
