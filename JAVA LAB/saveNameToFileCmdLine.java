import java.io.*;

public class saveNameToFileCmdLine {
    public static void main(String[] args) {
        // File file = new File("someFile.txt");
        String msg = " ";
        try {
            FileOutputStream fos = new FileOutputStream("name.txt");
            // DataOutputStream dos = new DataOutputStream(fos);
            for (int i = 0; i < args.length; i++) {
                msg = msg + args[i] + " ";
            }
            System.out.println(msg);
            fos.write(msg.getBytes());
            fos.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
// Write a program to accept three file names from commanad line arguments. copy
// the content of first 2 files in the third file