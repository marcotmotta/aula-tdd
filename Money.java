abstract class Money  {
  protected int amount;
  protected String currency;

  public boolean equals(Object object)  {
    Money money = (Money) object;
    return this.amount == money.amount && getClass().equals(money.getClass());
  }

  abstract Money times(int multiplier);

  static Money dollar(int amount){
    return new Dollar(amount, "USD");
  }

  static Money franc(int amount){
    return new Franc(amount, "CHF");
  }

  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }

  String currency() {
    return this.currency;
  }
}

class Dollar extends Money {
  Dollar(int amount, String currency) {
    super(amount, currency);
  }

  Money times(int multiplier) {
    return Money.dollar(this.amount * multiplier);
  }
}

class Franc extends Money {
  Franc(int amount, String currency) {
    super(amount, currency);
  }

  Money times(int multiplier)  {
    return Money.franc(this.amount * multiplier);
  }
}