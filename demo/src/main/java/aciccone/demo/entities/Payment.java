package aciccone.demo.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    private double amount;

    private String method;//paypal, card, stripe

    private String status; //success, faiiled, pending

    private LocalDate paymentData;
    public Payment(){};

    public Payment(Long id, User user, double amount, String method, String status, LocalDate paymentData) {
        this.user = user;
        this.amount = amount;
        this.method = method;
        this.status = status;
        this.paymentData = paymentData;
    }


    public Long getId() {
        return id;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getPaymentData() {
        return paymentData;
    }

    public void setPaymentData(LocalDate paymentData) {
        this.paymentData = paymentData;
    }

    @Override
    public String toString() {
        return "Payments{" +
                "Id=" + id +
                ", user=" + user +
                ", amount=" + amount +
                ", method='" + method + '\'' +
                ", status='" + status + '\'' +
                ", paymentData=" + paymentData +
                '}';
    }
}
