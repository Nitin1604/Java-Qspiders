class Car extends Vehicle {
    int a = 50;

    Car() {
        super();  
        System.out.println("Car no-arg constructor");
    }

    Car(int p) {
        super(30);  
        System.out.println("Car int-arg constructor");
    }
}