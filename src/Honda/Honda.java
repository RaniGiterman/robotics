package Honda;

import Motorcycle.Motorcycle;

public class Honda extends Motorcycle {
    public Honda(int _price) {
        super(_price);
    }

    public int sale() {
        return this._price;
    }
}
