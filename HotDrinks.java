package Sem1.Homework;

public class HotDrinks extends Drinks{
	protected int temperature;

	public HotDrinks(String name, double volume,int temperature) {
		this.temperature = temperature;
		super.name = name;
		super.volume = volume;
	}

	public int getTemperature() {
		return temperature;
	}

	@Override
	public String toString() {
		return "Name: "+ this.getName() +
			 ", Volume: " + String.valueOf(this.getVolume()) +
			 "Temperature: " + String.valueOf(this.getTemperature());
	}
}
