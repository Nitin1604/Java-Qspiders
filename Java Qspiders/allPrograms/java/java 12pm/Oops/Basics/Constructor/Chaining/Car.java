class Car{
	String name;
	int price;
	String color;
	int hp;
	int strokes;
	Car(){
		System.out.println("Car Object is created");
	}
	Car(String name){
		this();
		this.name=name;
	}
	Car(String name, int price){
		this(name);
		this.price=price;
	}
	Car(String name, int price, String color){
		this(name, price);
		this.color=color;
	}
	Car(String name, int price, String color, int hp){
		this(name, price, color);
		this.hp=hp;
	}
	Car(String name, int price, String color, int hp, int strokes){
		this(name, price, color, hp);		
		this.strokes=strokes;
	}
	public void getDetails(){
		System.out.println("Name is: "+name);
		System.out.println("Price is: "+price);
		System.out.println("COlor is: "+color);
		System.out.println("HP is: "+hp);
		System.out.println("Strokes is: "+strokes);
		System.out.println("================");
	}
}

