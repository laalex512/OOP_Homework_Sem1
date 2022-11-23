package Sem1.Homework;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine implements TradeMachine{
	List<HotDrinks> currentList = new ArrayList<>();


	@Override
	public void addDrink(HotDrinks drinks) {
		this.currentList.add(drinks);
	}


	@Override
	public String getProduct(String name, double volume, int temperature) {
		for (HotDrinks i: this.currentList){
			if(i.getName().equals(name) && (i.getVolume() == volume && i.getTemperature() == temperature)){
				this.currentList.remove(i);
				return "Getting HotDrink - Name: " + name + ", Volume: " +
					 String.valueOf(volume) + ", Temperature: " + String.valueOf(temperature);
			}
		}
		return "No such this HotDrink";
	}

	public String printMachine(){
		String message = "";
		for (HotDrinks i: this.currentList){
			message += i.toString() + "\n";
		}
		return message;
	}
}
