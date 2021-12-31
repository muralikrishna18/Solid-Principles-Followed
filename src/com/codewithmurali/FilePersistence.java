package com.codewithmurali;

public class FilePersistence implements InvoicePersistence{
    String filename;
    FilePersistence(String filename){
        this.filename = filename;
    }
    @Override
    public void saveInvoice() {
        System.out.println("saving to file"+filename);
    }
}
