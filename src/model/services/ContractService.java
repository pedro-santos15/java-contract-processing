package model.services;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
    private OnlinePaymentService service;

    public ContractService(OnlinePaymentService service) {
        this.service = service;
    }

    public OnlinePaymentService getService() {
        return service;
    }

    public void setService(OnlinePaymentService service) {
        this.service = service;
    }

    public void processContract(Contract contract, Integer months) {
        double parcelBaseValue = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {

            double parcelInterest = parcelBaseValue + service.interest(parcelBaseValue, i);
            double parcelTotalValue = parcelInterest + service.paymentFee(parcelInterest);

            Installment installment = new Installment(contract.getDate().plusMonths(i), parcelTotalValue);
            contract.addInstallment(installment);
        }
    }
}
