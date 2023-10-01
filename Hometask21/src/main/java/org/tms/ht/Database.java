package org.tms.ht;

import org.tms.ht.domain.Device;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Database {

//    private static List<Device> devicesList = new ArrayList<>();

        private static List<Device> devices = new ArrayList<>();

        public void create(Device device) {
            devices.add(device);
        }

    public List<Device> getByBrand(String brand) {
        if (brand == null || brand.isBlank()) {
            return devices;
        }

        return devices.stream()
                .filter(device -> device.getBrand().equals(brand))
                .collect(Collectors.toList());

    }

}
