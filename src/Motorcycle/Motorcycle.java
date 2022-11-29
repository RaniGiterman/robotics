package Motorcycle;

import Vehicle.Vehicle;

public class Motorcycle extends Vehicle {
    public int num = 0;

    @Override
    public int drive(int km) {
        if ((this._original_price / 4) * 3 < this._price)
            this._price -= km * 20;

        this._kilometrage += km;

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

    public Motorcycle(int _price) {
        this._price = _price;
        this._original_price = _price;
        this._serialNum = num;
        this._kilometrage = 0;
        this._sign = "Motorcycle";

        num++;
    }
}
