package templateCallbackPattern;

public interface BufferedReaderCallback {
    int doWithReader(String line, int result);
}
