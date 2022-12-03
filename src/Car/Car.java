package Car;

import Vehicle.Vehicle;

public abstract class Car extends Vehicle {
    public boolean coolCar = true;
    public int num = 0;

    public abstract int sale();

    @Override
    public int drive(int km) {
        if (this._original_price / 4 < this._price)
            this._price -= km * 100;

        this._kilometrage += km;

        if (this._kilometrage > 100 && !coolCar) {
            coolCar = false;
            this._price = this._original_price * 2;
        }

        return this._kilometrage;
    }

    @Override
    public int getPrice() {
        return this._price;
    }

    @Override
    public int getSerialNum() {
        return this._serialNum;
    }

    public Car(int _price) {
        this._price = _price;
        this._original_price = _price;
        this._serialNum = num;
        this._kilometrage = 0;

        num++;
    }
}
