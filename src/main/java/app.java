import org.apache.commons.lang3.time.StopWatch;
public class app {
    public static void main(String[] args) {
        StopWatch reloj = new StopWatch();
        reloj.start();
        System.out.println("Contando segundos...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        reloj.stop();
        System.out.println("Tiempo transcurrido: " + reloj.getTime() + " ms");
    }
}
