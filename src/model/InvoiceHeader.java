package model;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
    private int invoiceNum;
    private Date date=new Date();
    private String customerName;
    ArrayList<InvoiceLine> invoiceLineArrayList =new ArrayList<>();

    public InvoiceHeader() {
    }

    public InvoiceHeader(int invoiceNum, Date date, String customerName, ArrayList<InvoiceLine> invoiceLineArrayList) {
        this.invoiceNum = invoiceNum;
        this.date = date;
        this.customerName = customerName;
        this.invoiceLineArrayList = invoiceLineArrayList;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<InvoiceLine> getInvoiceLineArrayList() {
        return invoiceLineArrayList;
    }

    public void setInvoiceLineArrayList(ArrayList<InvoiceLine> invoiceLineArrayList) {
        this.invoiceLineArrayList = invoiceLineArrayList;
    }

    @Override
    public String toString() {
        return "InvoiceHeader{" +
                "invoiceNum=" + getInvoiceNum() +
                ", date=" + getDate() +
                ", customerName='" + getCustomerName() + '\'' +
                ", invoiceLineArrayList=" + getInvoiceLineArrayList() +
                '}';
    }
}
