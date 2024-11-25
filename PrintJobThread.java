
public class PrintJobThread extends Thread {
     private Printer printer;
    private String jobName;
    private int pagesToPrint;

    public PrintJobThread(Printer printer, String jobName, int pagesToPrint) {
        this.printer = printer;
        this.jobName = jobName;
        this.pagesToPrint = pagesToPrint;
    }

    @Override
    public void run() {
        printer.printPages(jobName, pagesToPrint);
    }
}

