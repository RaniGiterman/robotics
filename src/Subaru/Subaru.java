package Subaru;

import Car.Car;

public class Subaru extends Car {
    public boolean canSale = true;

    public Subaru(int _price) {
        super(_price);
    }

    @Override
    public int sale() {
        if (canSale) {
            this._price -= this._price / 30;
            canSale = false;
        } else {
            this._price += this._price / 10;
        }
        return this._price;
    }
}
