
public class RefillThread extends Thread{
     private Printer printer;
    private int pagesToAdd;

    public RefillThread(Printer printer, int pagesToAdd) {
        this.printer = printer;
        this.pagesToAdd = pagesToAdd;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000); // Simulate some delay in refilling
        } catch (InterruptedException e) {
            System.out.println("Refill thread interrupted.");
        }
        printer.refillPages(pagesToAdd);
    }
}

