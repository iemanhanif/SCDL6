
public class Printer {
     private int pagesAvailable = 10;

    // Synchronized method to print pages
    public synchronized void printPages(String jobName, int pagesToPrint) {
        System.out.println("Job " + jobName + " requests to print " + pagesToPrint + " pages.");
        while (pagesToPrint > pagesAvailable) {
            System.out.println("Not enough pages available for " + jobName + ". Waiting for refill...");
            try {
                wait(); // Thread waits until pages are refilled
            } catch (InterruptedException e) {
                System.out.println("Print thread interrupted.");
            }
        }

        pagesAvailable -= pagesToPrint;
        System.out.println("Job " + jobName + " printed successfully. Remaining pages: " + pagesAvailable);
    }

    // Synchronized method to refill pages
    public synchronized void refillPages(int pages) {
        System.out.println("Refilling printer tray with " + pages + " pages.");
        pagesAvailable += pages;
        System.out.println("Pages refilled. Total pages available: " + pagesAvailable);
        notifyAll(); // Notify waiting threads
    }
}

