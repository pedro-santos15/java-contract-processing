package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Entre os dados do contrato:");
            System.out.print("Numero: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Data (dd/MM/yyyy): ");
            LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
            System.out.print("Valor do contrato: ");
            double value = sc.nextDouble();

            Contract contract = new Contract(number, date, value);

            System.out.print("Entre com o numero de parcelas: ");
            int months = sc.nextInt();

            ContractService service = new ContractService(new PaypalService());
            service.processContract(contract, months);

            System.out.println("Parcelas:");
            for (Installment installment : contract.getInstallments()) {
                System.out.println(installment);
            }
        } catch (InputMismatchException e) {
            System.out.println("Por favor, verifique os dados de entrada.");
        }
    }
}
