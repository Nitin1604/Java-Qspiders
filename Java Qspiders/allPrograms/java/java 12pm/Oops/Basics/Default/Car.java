class Car {
    int x;
 
    public void run() {
        System.out.println("This is run method");
    }
	double y;

    public void start() {
        System.out.println("This is start method");
    }
	String z;

    public static void main(String[] args) {
    
        Car carObj = new Car();
     
        carObj.run();
        carObj.start();
    }
}
