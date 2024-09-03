class CarDriver 
{
	public static void main(String[] args) 
	{
		Car.showroom="CARSHOW";
		Car c=new Car();
		c.brand="BMW";
		c.col="black";
		c.price=45000000;
		c.details();

		Car c1=new Car();
		c1.brand="AUDI";
		c1.col="RED";
		c1.price=50000000;
		c1.details();

		Car c2=new Car();
		c2.brand="RANGE ROVER";
		c2.col="black";
		c2.price=80000000;

		
		
		c2.details();
	}
}
