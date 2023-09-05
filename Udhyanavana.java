 class Udhyanavana {
    int id;
    int noOfGates;
    String flowers[] ;
    int startTime;
    int endTime;

    public Udhyanavana() {
        this(1, 2, new String[]{"Hibiscus", "Jasmin", "Rose", "Mallige", "MariGold"}, 6, 9);
    }

    public Udhyanavana(int id, int noOfGates, String flowers[], int startTime, int endTime) {
        this.id = id;
        this.noOfGates = noOfGates;
        this.flowers = flowers;
        this.startTime = startTime;
        this.endTime = endTime;
        displayDetails();
    }

    public void huuvu() {
        for (int flo = 0; flo < flowers.length; flo++) {
            System.out.println("Flowers in Udhyanavana: " + flowers[flo]);
        }
    }

    public void displayDetails() {
        System.out.println("Udhyanavana ID: " + this.id);
        System.out.println("Number of gates in Udhyanavana: " + this.noOfGates);
        System.out.println("Start Time of Udhyanavana: " + this.startTime + "am");
        System.out.println("End Time of Udhyanavana: " + this.endTime + "pm");
    }
}
