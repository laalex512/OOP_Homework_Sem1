package Sem1.Homework;

import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {
		HotDrinks cofee1 = new HotDrinks("coffee1", 0.15, 60);
		HotDrinks cofee2 = new HotDrinks("coffee2", 0.3, 70);
		HotDrinks cofee3 = new HotDrinks("coffee3", 0.5, 80);
		HotDrinks tea1 = new HotDrinks("tea1", 0.15, 60);
		HotDrinks tea2 = new HotDrinks("tea2", 0.3, 70);
		HotDrinks tea3 = new HotDrinks("tea3", 0.5, 80);

		HotDrinksMachine htMachineCofee = new HotDrinksMachine();
		HotDrinksMachine htMachineTea = new HotDrinksMachine();

		htMachineCofee.addDrink(cofee3);
		htMachineCofee.addDrink(cofee2);
		htMachineCofee.addDrink(cofee1);

		htMachineTea.addDrink(tea1);
		htMachineTea.addDrink(tea2);
		htMachineTea.addDrink(tea3);

		Logger logger = Logger.getAnonymousLogger();
		String outMessage = "";
		outMessage = "\nCofee Machine: \n" + htMachineCofee.printMachine() +"\n Tea Machine:\n" + htMachineTea.printMachine();
		logger.info(outMessage);

		logger.info(htMachineCofee.getProduct("coffee2", 0.3, 70 ));
		logger.info(htMachineTea.getProduct("tea3", 0.5, 80));

		outMessage = "\nCofee Machine: \n" + htMachineCofee.printMachine() +"\n Tea Machine:\n" + htMachineTea.printMachine();
		logger.info(outMessage);
	}
}
