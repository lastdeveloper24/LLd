package SinkStrategy;

public class ConsoleSink implements Sink{
    @Override
    public void write(String content) {
        System.out.println(content);
    }
}
