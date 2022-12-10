
public class CarClass {

	public static void main(String[] args) {
	
		Car car1 = new Car();
		car1.printData();
		car1.accelerate();
		car1.brake();
		car1.printData();
		car1.refuel(5);
		
		
		Car car2 = new Car("Fiat","200", 10);
		car2.printData();
		
		
	}

}

class Car
{
		public boolean accelerate;
		public String brand;
		public String model;
		public int amountOfFuel;
		
		public Car()
		{
			accelerate=true;
			brand="Honda";
			model="300";
			amountOfFuel=20;
		}
		
		public Car(String brand,String model,int amountOfFuel)
		{
			accelerate=true;
			this.brand=brand;
			this.model=model;
			this.amountOfFuel=amountOfFuel;
		}
		
		public void brake()
		{
			accelerate=false;
			System.out.println("Car is breaking");
			
		}
		public void accelerate()
		{
			accelerate=true;
			System.out.println("Car is accelerating");
			amountOfFuel--;
			if(amountOfFuel<=0)
			{
				accelerate=false;
			}
			
		}
		public void refuel(int amount)
		{
			System.out.println("Fuel on the tank: "+ amountOfFuel);
			System.out.println("Refuel: " +amount);
			System.out.println("Fuel on the tank after tthe refuel: " + (amountOfFuel+amount));
		}
		public void printData()
		{
			System.out.println("Brand: " + brand);
			System.out.println("Model: " + model);
			System.out.println("Fuel: " + amountOfFuel);
			
		}
}