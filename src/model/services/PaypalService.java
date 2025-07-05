package model.services;

public class PaypalService implements OnlinePaymentService {
    @Override
    public Double paymentFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        double monthPercentage = months * 0.01;
        return amount * monthPercentage;
    }
}
