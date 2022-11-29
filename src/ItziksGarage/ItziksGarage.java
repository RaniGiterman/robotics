package ItziksGarage;

import Vehicle.Vehicle;

public class ItziksGarage {
    public Vehicle[] _vehicles;
    public int _vehicles_length = 0;
    public int _motorcycle_quantity = 0;

    public Vehicle[] addVehicle(Vehicle vehicle) {
        Vehicle[] new_arr = new Vehicle[_vehicles_length + 1];
        if (_vehicles_length == 0) {
            new_arr[_vehicles_length] = vehicle;
            _vehicles = new_arr;
        } else {
            for (int i = 0; i < _vehicles_length; i++) {
                new_arr[i] = _vehicles[i];
            }

            new_arr[_vehicles_length] = vehicle;
            _vehicles = new_arr;
        }

        if (vehicle._sign == "Motorcycle") {
            _motorcycle_quantity++;
        }

        _vehicles_length++;
        return _vehicles;
    }

    public int getMotorcycleQuantity() {
        return _motorcycle_quantity;
    }

    public ItziksGarage() {
    }
}