abstract class Money  {
  protected int amount;

  public boolean equals(Object object)  {
    Money money = (Money) object;
    return this.amount == money.amount && getClass().equals(money.getClass());
  }

  abstract Money times(int multiplier);

  static Money dollar(int amount){
    return new Dollar(amount);
  }

  static Money franc(int amount){
    return new Franc(amount);
  }
}

class Dollar extends Money {
  Dollar(int amount) {
    this.amount = amount;  
  }

  Money times(int multiplier) {
    return new Dollar(this.amount * multiplier);
  }

}

class Franc extends Money {
  Franc(int amount) {
    this.amount = amount;
  }

  Money times(int multiplier)  {
    return new Franc(this.amount * multiplier);
  }
}