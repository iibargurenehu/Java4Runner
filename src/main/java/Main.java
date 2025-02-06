public class Main {
    public static void main(String[] args) throws InterruptedException {
        int i=1;
        while(true){
            System.out.println("Mensaje numero "+i);
            i++;
            Thread.sleep(1000);
        }
    }
}
