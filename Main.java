
public class Main {
     public static void main(String[] args) {
        Printer printer = new Printer();

        // Print job thread requests 15 pages
        PrintJobThread printJob = new PrintJobThread(printer, "Job1", 15);

        // Refill thread adds 10 more pages to the tray
        RefillThread refill = new RefillThread(printer, 10);

        printJob.start();
        refill.start();
    }
}

