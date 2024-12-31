class Rectangle {
    int length;
    int width;

   
    public void findArea() {
        System.out.println("Area of rectangle is: " + (length * width));
    }

    public void findPerimeter() {
        System.out.println("Perimeter of rectangle is: " + 2 * (length + width));
    }

    public static void main(String[] args) {
     
        Rectangle r1 = new Rectangle();
        r1.length = 5;
        r1.width = 3;
        r1.findArea();
        r1.findPerimeter();
    }
}
