//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        double itemPrice = 10.0;
        final double SALES_TAX_RATE = 0.05;
        double salesTax;
        double totalCost;

        salesTax = itemPrice * SALES_TAX_RATE;
        totalCost = itemPrice + salesTax;

        System.out.println("The item price is $" + itemPrice + ". The sales tax is $ " + salesTax + ". Your total price is $" + totalCost );




    }
}