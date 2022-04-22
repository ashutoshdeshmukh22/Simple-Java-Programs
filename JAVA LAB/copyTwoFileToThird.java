import java.io.*;

public class copyTwoFileToThird {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("file3.txt");
        FileReader fr1 = new FileReader("file1.txt");
        FileReader fr2 = new FileReader("file2.txt");
        BufferedReader br = new BufferedReader(fr1);

        String f2line = br.readLine();

        // copy each line of file1.txt to file3.txt
        while (f2line != null) {
            fos.write(f2line.getBytes());
            f2line.replaceAll("\\s", "");
            f2line = br.readLine();
        }

        br = new BufferedReader(fr2);
        f2line = br.readLine();

        // copy each line of file2.txt to file3.txt
        while (f2line != null) {
            fos.write(f2line.getBytes());
            f2line = br.readLine();
        }
        System.out.println("Merged file1 and file2 to file3");
        fos.close();
        br.close();
        fr1.close();
        fr2.close();
    }
}
