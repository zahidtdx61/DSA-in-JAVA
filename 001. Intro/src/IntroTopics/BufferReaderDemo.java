package IntroTopics;

import java.io.*;

public class BufferReaderDemo {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter Integer: ");
            int s = Integer.parseInt(br.readLine());

            System.out.println("You have entered " + s);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}
