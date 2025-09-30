package rest.warehouse;

import rest.model.*;

import java.util.ArrayList;
import java.util.List;

public class WarehouseSimulation {
	
	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		double rounded = Math.round(number * 100.0) / 100.0; 
		return rounded;
		
	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum; 
		Long rounded = Math.round(number); 
		return rounded.intValue();

	}
	
	public WarehouseData getData( String inID ) {

		WarehouseData data = new WarehouseData();
		data.setWarehouseID(inID);
		data.setWarehouseName("Linz Bahnhof");
		data.setWarehouseAddress("Bahnhofsstrasse 27/9");
		data.setWarehousePostalCode("4020");
		data.setWarehouseCity("Linz");
		data.setWarehouseCountry("Austria");
		List<ProductData> products = new ArrayList<>();

		ProductData p = new ProductData();
		p.setProductID("00-443175");
		p.setProductName("Bio Orangensaft Sonne");
		p.setProductCategory("Getraenk");
		p.setProductQuantity(2500);
		p.setProductUnit("Packung 1L");
		products.add(p);
		data.setProductData(products);
		return data;
		
	}

}
