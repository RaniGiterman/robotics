package Honda;

import Motorcycle.Motorcycle;

public class Honda extends Motorcycle {
    public Honda(int _price) {
        super(_price);
    }

    @Override
    public int sale() {
        return this._price;
    }
}
