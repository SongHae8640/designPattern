package templateCallbackPattern;

import org.springframework.core.io.ClassPathResource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {
    public int calcSum(String path) throws RuntimeException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new ClassPathResource(path).getFile()));
            int sum = 0;
            String line;
            while ((line = br.readLine()) != null){
                sum += Integer.parseInt(line);
            }

            return sum;
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

    public int calcMultiply(String path) throws RuntimeException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new ClassPathResource(path).getFile()));
            int multiply = 1;
            String line;
            while ((line = br.readLine()) != null){
                multiply *= Integer.parseInt(line);
            }

            return multiply;
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
}
