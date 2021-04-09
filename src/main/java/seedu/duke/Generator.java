package seedu.duke;

import java.util.ArrayList;

import static seedu.duke.DataManager.itemRetriever;

public class Generator {

	/**
	 * Method to generate profile on first usage of Deliviri
	 * @return Deliveryman object with preset attributes
	 */
	public Deliveryman profileGenerator(){
		String driverName = "Obi Wan";
		String vehicleModel = "YT-1300";
		String licensePlate = "HIGHGROUND";
		int maxWeight = 40;

		return new Deliveryman(driverName, licensePlate, vehicleModel,maxWeight);
	}

	/**
	 * Method to generate deliveries of Deliviri
	 * @return list of deliveries
	 */
	public ArrayList<Delivery> deliveriesGenerator(){
		ArrayList<Delivery> deliveries = new ArrayList<>();
		String deliveryStatus = "N";
		String[] deliveryIds = {"1001", "1002", "1003", "1004", "1005", "1006", "1007"};
		String[] addresses = {"NTU Hall 5", "NTU Hall 3", "NTU Hall Oween", "NTU Hall 6", "NTU Hall 1", "NTU Hall 14", "NTU Hall Othere"};
		String[] recipients = {"Jethro", "Manika", "Calvin", "Zhi fah", "Anakin", "Jeremy", "Kenobi"};
		String[][] itemsList = {{"13-2", "14-3"}, {"13-5", "16-2"}, {"13-5", "16-2"}, {"13-5", "16-2"}, {"13-5", "16-2"}, {"13-5", "16-2"}, {"13-5", "16-2"}};
		for (int i = 0; i < 7; i++){
			ArrayList<Item> items = itemRetriever(itemsList[i]);
			deliveries.add(new Delivery(deliveryStatus, deliveryIds[i], addresses[i], recipients[i], items));
		}
		return deliveries;
	}

	/**
	 * Method to generate route for Deliviri
	 * @return list of routes
	 */
	public ArrayList<Route> routesGenerator(){
		ArrayList<Route> routes = new ArrayList<>();
		String[] locations = {"NTU Hall 5", "NTU Hall 3", "NTU Hall Oween", "NTU Hall 6", "NTU Hall 1", "NTU Hall 14", "NTU Hall Othere"};
		Double[] deliveryFees = {5.00, 3.00, 11.00, 6.00, 1.00, 14.00, 15.00};
		int[] distances = {10, 3, 11, 6, 1, 14, 15};
		for (int i = 0; i < 7; i++){
			routes.add(new Route(locations[i], deliveryFees[i], distances[i]));
		}
		return routes;
	}
}
