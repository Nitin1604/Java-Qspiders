class CarDriver{
	public static void main(String[] args){
		Car c1=new Car("TATA", 325325, "White");
		Car c2=new Car("Maruti", 566779, "Black");
		Car c3=new Car("MG", 596779, "Black");
		Car c4=new Car(c2);
		Car c5=new Car(c1);
		Car c6=new Car(c4);

		c1.getDetails();
		c2.getDetails();
		c3.getDetails();
		c4.getDetails();
		c5.getDetails();
		c6.getDetails();
	}
}

