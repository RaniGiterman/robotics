package ItziksGarage;

import java.util.ArrayList;
import java.util.List;

import Motorcycle.Motorcycle;
import Vehicle.Vehicle;

public class ItziksGarage {
    private int _vehiclesLength = 50;
    private int _vehiclesIndex = 0;
    public Vehicle[] _vehicles = new Vehicle[_vehiclesLength];
    // public List<Vehicle> _vehicles = new ArrayList<Vehicle>(_vehiclesLength);

    public Vehicle[] addVehicle(Vehicle vehicle) {
        if (_vehiclesIndex >= _vehiclesLength) {
            // if the array exeeded size - add 50% more of current size
            double halfMore = _vehiclesLength / 2.0;
            halfMore = Math.ceil(halfMore);
            Vehicle[] new_arr = new Vehicle[_vehiclesLength + (int) halfMore];
            // copy all elements to new arr
            for (int i = 0; i < _vehiclesLength; i++) {
                new_arr[i] = _vehicles[i];
            }

            new_arr[_vehiclesLength] = vehicle;
            _vehiclesLength = _vehiclesLength + (int) halfMore;
            _vehicles = new_arr;
        } else {
            _vehicles[_vehiclesIndex] = vehicle;
        }

        _vehiclesIndex++;
        return _vehicles;
    }

    public int getMotorcycleQuantity() {
        int count = 0;
        for (int i = 0; i < _vehiclesLength; i++) {
            if (_vehicles[i] instanceof Motorcycle) {
                count++;
            }
        }

        return count;
    }

    public ItziksGarage() {
    }
}