package Vehicle;

import ItziksGarage.ItziksGarage;

public abstract class Vehicle extends ItziksGarage {
    public int _price;
    public int _original_price;
    public int _serialNum;
    public int _kilometrage;
    public String _sign;

    public abstract int drive(int km);

    public abstract int getPrice();

    public abstract int getSerialNum();
}
