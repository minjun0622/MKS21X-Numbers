public class RationalNumber extends RealNumber {
  private int nume;
  private int deno;

  public RationalNumber(int a, int b) {
    nume = a;
    deno = b;
    //two integers, numerator and the denominator. Since they are a ration, it is a fraction.
  }

  public double getValue() {
    //returns the double, a division of nume and demo
  }

  public String toString() {
    return nume + " : " + deno;
    //since number, more specifically a double, can't tell us much, we have to use ratios?
  }

}
