package DatabaseConnection;

import NormalCar.*;
import AutonomousCar.*;

import java.awt.*;
import java.sql.*;
import java.util.ArrayList;

public class PostgresDatabase {
    private final Database database;

    public PostgresDatabase(Database database) {
        this.database = database;
    }

    public void saveCar(Car car) throws SQLException {
        String query = String.format("INSERT INTO cars (make, model, year, battery_size, fuel_tank_size, is_autonomous) VALUES ('%s', '%s', %d, %d, %d, %d, %s)",
                car.getMake(),
                car.getModel(),
                car.getYear(),
                car instanceof ElectricCar ? ((ElectricCar) car).getBatteryCapacity() : 0,
                car instanceof HybridCar ? ((HybridCar) car).getFuelCapacity() : 0 );
        database.executeUpdate(query);
    }

    public ArrayList<Car> getCars() throws SQLException {
        ArrayList<Car> cars = new ArrayList<>();
        String query = "SELECT * FROM cars";
        ResultSet resultSet = database.executeQuery(query);
        while (resultSet.next()) {
            String make = resultSet.getString("make");
            String model = resultSet.getString("model");
            int year = resultSet.getInt("year");
            int batteryCapacity = resultSet.getInt("battery_size");
            int fuelCapacity = resultSet.getInt("fuel_tank_size");
            boolean isAutonomous = resultSet.getBoolean("is_autonomous");
            if (batteryCapacity > 0) {
                cars.add(new ElectricCar(make, model, year, batteryCapacity));
            } else if (fuelCapacity > 0) {
                cars.add(new HybridCar(make, model, year,batteryCapacity, fuelCapacity));
            } else {
                cars.add(new DieselCar(make, model, year,fuelCapacity));
            }
        }
        return cars;
    }
}