public class Lab_04_01_SalesTax{
    public static void main(String[] args){

        double purchasePrice = 80.00;
        double taxRate = 0.05;
        double salesTax = purchasePrice * taxRate;

        System.out.println("The purchase price is: " + purchasePrice);
        System.out.println("The sales tax at 5% is: " + salesTax);
    }
}

