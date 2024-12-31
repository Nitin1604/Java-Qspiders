class Car{
	String name;
	int price;
	String color;
	Car(String name, int price, String color){
		this.name=name;
		this.price=price;
		this.color=color;
	}
	public void getDetails(){
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
		System.out.println("COlor is: "+color);
		System.out.println("================");
	}
}

