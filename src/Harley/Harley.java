package Harley;

import Motorcycle.Motorcycle;

public class Harley extends Motorcycle {

    public Harley(int _price) {
        super(_price);
    }

    @Override
    public int sale() {
        if (this._price - 10 > this._original_price / 2)
            this._price -= 10;

        return this._price;
    }
}
