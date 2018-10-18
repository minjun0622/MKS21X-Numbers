//Minjun Seo
public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  public RationalNumber(int numerator, int denominator){
    super(0);
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public double getValue(){
    return (double)numerator/(double)denominator;
  }


  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    RationalNumber A = new RationalNumber(denominator, numerator);
    return A;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return this.getNumerator() == other.getNumerator() && this.getDenominator() == other.getDenominator();
  }

  public String toString(){
    if (denominator == 1) {
      return "Value: " + numerator;
    }
    if (numerator == 0) {
      return "Value: 0";
    }
    if (denominator == 0) {
      return "Value: 0";
    }
    if (numerator < 0 && denominator > 0) {
      return "Value: -(" + -numerator + "/" + denominator + ")";
    }
    if (numerator >= 0 && denominator < 0) {
      return "Value: -(" + numerator + "/" + -denominator + ")";
    }
    return "Value: " + Math.abs(numerator) + "/" + Math.abs(denominator);
  }


  private static int gcd(int a, int b){
    int x = Math.max(Math.abs(a),Math.abs(b));
    int y = Math.min(Math.abs(a),Math.abs(b));
    if (y == 0) {
      return x;
    }else {
      return gcd(y, x % y);
    }
  }
  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int newDenominator = denominator / gcd(numerator, denominator);
    numerator= numerator / gcd(numerator, denominator);
    denominator = newDenominator;
  }
  public RationalNumber add(RationalNumber other) {
    RationalNumber A = new RationalNumber(this.getNumerator() * other.getDenominator() + other.getNumerator() * this.getDenominator(), this.getDenominator() * other.getDenominator());
    return A;
  }
  public RationalNumber subtract(RationalNumber other) {
    RationalNumber A = new RationalNumber(this.getNumerator() * other.getDenominator() - other.getNumerator() * this.getDenominator(), this.getDenominator() * other.getDenominator());
    return A;
  }
  public RationalNumber multiply(RationalNumber other) {
    RationalNumber A = new RationalNumber(this.getNumerator() * other.getNumerator(), this.getDenominator() * other.getDenominator());
    return A;
  }
  public RationalNumber divide(RationalNumber other) {
    RationalNumber A = new RationalNumber(this.getNumerator() / other.getNumerator(), this.getDenominator() / other.getDenominator());
    return A;
  }
}
