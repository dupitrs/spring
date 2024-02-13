package rvt;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public Money(int euros) {
        this(euros, 0);
    }

    public Money() {
        this(0, 0);
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }



    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        if (newCents >= 100) {
            newEuros += newCents / 100;
            newCents %= 100;
        }


        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }


    public Money minus(Money subtraction) {
        int thisMoneyAsCents = this.euros * 100 + this.cents;
        int subtractionMoneyAsCents = subtraction.euros * 100 + subtraction.cents;

        int newCents = thisMoneyAsCents - subtractionMoneyAsCents;
        int newEuros = 0;

        if (newCents < 0 ) {
            newCents = 0;
        }

        if (newCents >= 100) {
            newEuros += newCents / 100;
            newCents %= 100;
        }

        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }




    public boolean lessThan(Money compared) {
        int thisMoneyAsCents = this.euros * 100 + this.cents;
        int comparedMoneyAsCents = compared.euros * 100 + compared.cents;

        boolean lessThan;

    if (thisMoneyAsCents < comparedMoneyAsCents) {
        lessThan = true;
    } else {
        lessThan = false;
    }

    return lessThan;
    }


    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if(!(compared instanceof Money)) {
            return false;
        }
        Money comparedMoney = (Money) compared;


        if (this.euros == comparedMoney.euros && this.cents == comparedMoney.cents) {
            return true;
        }
        return false;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}