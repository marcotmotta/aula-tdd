class Money  {
   protected int amount;

   public boolean equals(Object object)  {
      Money money = (Money) object;
      return this.amount == money.amount;
   }
}

class Dollar extends Money {
  Dollar(int amount) {
    this.amount = amount;  
  }

  Dollar times(int multiplier) {
    return new Dollar(this.amount * multiplier);
  }

}

class Franc extends Money {
  Franc(int amount) {
    this.amount = amount;
  }

  Franc times(int multiplier)  {
    return new Franc(this.amount * multiplier);
  }
}