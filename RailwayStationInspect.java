class RailwayStationInspect{


public static void main(String[] args) {
        RailwayStation station = new RailwayStation();
        station.setRailwayStationName("KempeGowda Station");
        System.out.println("Railway Station Name: " + station.getRailwayStationName());

        station.setNumberOfPlatforms(20);
        System.out.println("Number of Platforms: " + station.getNumberOfPlatforms());

        station.setLocation("City Center");
        System.out.println("Location: " + station.getLocation());

        station.setNumberOfTicketCounters(5);
        System.out.println("Number of Ticket Counters: " + station.getNumberOfTicketCounters());

        station.setNumberOfEntryTerminals(4);
        System.out.println("Number of Entry Terminals: " + station.getNumberOfEntryTerminals());

        station.setNumberOfTrains(50);
        System.out.println("Number of Trains: " + station.getNumberOfTrains());

        station.setNumberOfEmployees(100);
        System.out.println("Number of Employees: " + station.getNumberOfEmployees());
    }
}