package solid.srp.classes;

import java.util.Date;

public class Invoice {
    private long amount;
    private Date invoiceDate;

    public Invoice(long amount, Date invoiceDate) {
        this.amount = amount;
        this.invoiceDate = invoiceDate;
    }
}