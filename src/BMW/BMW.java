package BMW;

import Car.Car;

public class BMW extends Car {

    public boolean coolCar = true;
    public boolean canSale = true;

    public BMW(int _price) {
        super(_price);
    }

    @Override
    public int sale() {
        if (canSale) {
            this._price -= this._price / 10;
            canSale = false;
        }
        return this._price;
    }
}
