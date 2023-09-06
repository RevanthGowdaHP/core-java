class BusStandCheck{ 

 public static void main(String[] args) {
        BusStand busStand = new BusStand();
        busStand.setBusStandName("Central Bus Stand");
        System.out.println("Bus Stand Name: " + busStand.getBusStandName());

        busStand.setNumberOfBuses(100);
        System.out.println("Number of Buses: " + busStand.getNumberOfBuses());

        busStand.setNumberOfPlatforms(5);
        System.out.println("Number of Platforms: " + busStand.getNumberOfPlatforms());

        busStand.setNumberOfPassengers(5000);
        System.out.println("Number of Passengers: " + busStand.getNumberOfPassengers());

        busStand.setAddressOfBusStand("6 Main Road, VijayaNagar City");
        System.out.println("Address of Bus Stand: " + busStand.getAddressOfBusStand());

        busStand.setColorOfBuses("Blue");
        System.out.println("Color of Buses: " + busStand.getColorOfBuses());

        busStand.setTypeOfBus("BMTC");
        System.out.println("Type of Buses: " + busStand.getTypeOfBus());
    }
}
