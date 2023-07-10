package week5_withSaim;

public class CurrencyConverter {

    /*
    Currency Converter [methods, conditional, operators]

	create a method that will accept a currency type(String) and a currency amount (double)[as dollars] and convert the currency from dollars to a different type. return the converted number

	Use the following sample rates for currency conversions
		1 dollar = 0.91 euro
		1 dollar = 121.03 yen
		1 dollar = 14.85 lira
		1 dollar = 1,217.52 won
		1 dollar = 181.45 rupee

	Note: Don't worry about decimal formats, focus on the code to create these conversions

		Ex:
			Input: euro, 100
			Output: 91
		Ex:
			Input: yen, 50// means we are converting 50 dollars to yen
			Output: 6051.5
     */

    public static double convertFromDollar(String currency, double dollars){
        double result=dollars;//double result=0; dollars is better because it will return dollars
        switch (currency.toLowerCase().trim()) {
            case "euro":
                result=dollars *0.91;
                break;
                //instead : return dollars*0.91
            case "yen":
                result=dollars*121.03;
            case "lira":
                result=dollars *14.85;
                break;
            case "won":
                result=dollars *1217.52;
                break;
            case "rupee":
                result=dollars *181.45;
                break;
        }
        return result;
    }
}
