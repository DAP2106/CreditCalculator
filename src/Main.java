
public class Main {


    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPayment1Year = service.calculate(1_000_000, 1, 9.99);
        System.out.println(" Платеж в месяц " + monthlyPayment1Year + " рублей ");

        int monthlyPayment2Years = service.calculate(1_000_000, 2, 9.99);
        System.out.println(" Платеж в месяц " + monthlyPayment2Years + " рублей ");

        int monthlyPayment3Years = service.calculate(1_000_000, 3, 9.99);
        System.out.println(" Платеж в месяц " + monthlyPayment3Years + " рублей ");
    }
}