package templateCallbackPattern;

import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {

    public Integer fileReadTemplate(String path, BufferedReaderCallback callback, int initValue){
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new ClassPathResource(path).getFile()));
            String line;
            int result = initValue;
            while((line = br.readLine()) != null){
                result = callback.doWithReader(line, result);
            }
            return result;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public int calcSum(String path) throws RuntimeException {
        BufferedReaderCallback callback = new BufferedReaderCallback() {
            @Override
            public int doWithReader(String line, int result) {
                return result + Integer.parseInt(line);
            }
        };
        return fileReadTemplate(path, callback ,0);
    }

    public int calcMultiply(String path) throws RuntimeException {

        BufferedReaderCallback callback = new BufferedReaderCallback() {
            @Override
            public int doWithReader(String line, int result) {
                return result * Integer.parseInt(line);
            }
        };

        return fileReadTemplate(path, callback ,1);
    }
}
