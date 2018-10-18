//Minjun Seo
public class RealNumber {
  private double value;

  public RealNumber (double other) {
    value = other;
  }

  public double getValue() {
    return this.value;
  }

  public void setValue( double newother) {
    value = newother;
  }

  public String toString() {
    return "" + getValue();
  }

  public double add(RealNumber other){
     return this.value + (double)other.getValue();
   }

   public double multiply(RealNumber other){
    return this.value * (double)other.getValue();
  }

  public double divide(RealNumber other){
   return this.value / (double)other.getValue();
 }

 public double subtract(RealNumber other){
  return this.value - (double)other.getValue();
}
}
