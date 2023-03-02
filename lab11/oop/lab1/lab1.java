package lab11.oop.lab1;

import java.io.*;

public class lab1 {

    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("lab11/oop/lab1/build.xml");
            FileWriter out = new FileWriter("lab11/oop/lab1/output.dat");
            char buf[] = new char[64];
            int countRead = in.read(buf);
            // countRead = -1 no data, otherwise
            while (countRead != -1) {
                out.write(buf, 0, countRead);
                countRead = in.read(buf);
            }
            in.close(); // close stream input
            out.close(); // close stream output
            System.out.println(
                    "Read and write data to file complete.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
