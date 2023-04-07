public class CreditPaymentService {
    public int calculate(int FullCredit, int years, double percentCredit) {
        double monthPercent = percentCredit / 1200; //процентная ставка на месяц
        double summaMonth = years * 12;// колл месяцев

        double monthPayment = FullCredit * monthPercent / (1 - Math.pow(1 + monthPercent, - summaMonth));

        int monthPaymentInt = (int) monthPayment;
        return monthPaymentInt;
    }
}
