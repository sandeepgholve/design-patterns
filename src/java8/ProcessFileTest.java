package java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by sgholve on 9/24/15.
 */
public class ProcessFileTest {
    public static void main(String[] args) throws IOException {
        System.out.println(processFile());
        System.out.println("-------------");
        System.out.println(processFile((BufferedReader br) -> br.readLine()));
        System.out.println("-------------");
        System.out.println(processFile((BufferedReader br) -> br.readLine() + br.readLine()));
    }

    public static String processFile() throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("sample.txt"))) {
            return bufferedReader.readLine();
        }
    }

    public static String processFile(BufferReaderProcessor processor) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("sample.txt"))) {
            return processor.process(bufferedReader);
        }
    }
}

interface BufferReaderProcessor {
    String process(BufferedReader bufferedReader) throws IOException;
}
