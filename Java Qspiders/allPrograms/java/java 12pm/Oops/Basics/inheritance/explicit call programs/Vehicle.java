class Vehicle {
    int x = 10;

    Vehicle() {
        System.out.println("Vehicle no-arg constructor");
    }

    Vehicle(int x) {
        this.x = x;  
        System.out.println("Vehicle int-arg constructor");
    }
}