package com.codewithmurali;

public class DataBasePersistence implements InvoicePersistence {

    DataBasePersistence(Invoice invoice)
    {
    }
    @Override
    public void saveInvoice() {
        System.out.println("saving invoice to database");
    }
}
