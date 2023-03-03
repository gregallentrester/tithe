
/*
  strictfp keyword in java
  https://www.geeksforgeeks.org/strictfp-keyword-java/

  Float v Double | 4 Differences - When to use
  https://bit.ly/3UzDI8U
*/

public final class Tithe {

  public static final void main(String ... v) {

    // assumed: YOY == 1
    double EARNINGS =
      Double.parseDouble(v[0]);

    double TITHE =
      EARNINGS/10D;

    double TAXRATE =
      Double.parseDouble(v[1])/100D;

    System.err.println(
      "\nEarnings (pretax)  $" + EARNINGS);

    System.err.println(
      "Earnings (discount) $" + EARNINGS * .90);

    System.err.println(
      "\nTITHE $" + (TITHE));

    System.err.println(
      "TAXRATE " + TAXRATE + "\n");

    double secularYield =
      EARNINGS - (EARNINGS * TAXRATE);

    double discountYield =
      EARNINGS - (EARNINGS * .90 * TAXRATE);

    double actualYield =
      discountYield - TITHE;

    double loss =
      100D - ((actualYield / secularYield) * 100D);


    System.err.println(
      "Secular Yield  $" + secularYield);

    System.err.println(
      "Discount Yield  $" + discountYield);

    System.err.println(
      "Actual Yield  $" + actualYield + "\n");

    System.err.println(
      "Percent Realized Loss " + RED + loss + "%"+ NC);
  }


  public static final String RED = "\033[1;91m";
  public static final String GRN = "\033[1;92m";
  public static final String YLW = "\033[1;93m";
  public static final String NC = "\u001B[0m";
}
