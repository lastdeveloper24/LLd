public class Application {
    public static void main(String[] args) {
        LogDriver logDriver = new LogDriver();

        logDriver.Info("This application is working");

        logDriver.Info("This application process is complete ");
        logDriver.Info("This application is working");

        logDriver.Info("This application process is complete ");

        logDriver.Error("File Type not mathcing ");
    }
}