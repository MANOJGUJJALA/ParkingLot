package models;

import java.time.LocalDateTime;

public class Payment  extends BaseModel{

    private int amount;

    private LocalDateTime exitTime;
    private PaymentMODE paymentMODE;
    private String transactionNumber;

    private Bill bill;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    private Status status;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public PaymentMODE getPaymentMODE() {
        return paymentMODE;
    }

    public void setPaymentMODE(PaymentMODE paymentMODE) {
        this.paymentMODE = paymentMODE;
    }

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
