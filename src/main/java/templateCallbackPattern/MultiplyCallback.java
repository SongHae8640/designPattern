package templateCallbackPattern;

public class MultiplyCallback implements BufferedReaderCallback{
    @Override
    public int doWithReader(String line, int result) {
        return result * Integer.parseInt(line);
    }
}