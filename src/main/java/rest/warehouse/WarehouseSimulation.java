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
		data.setWarehousePostalCode("Linz");
		data.setWarehouseCity("Linz");
		data.setWarehouseCountry("Austria");
		List<ProductData> products = new ArrayList<>();

		ProductData p1 = new ProductData();
		p1.setProductID("01-" + getRandomInt(100000,999999));
		p1.setProductName("Bio Orangensaft Sonne");
		p1.setProductCategory("Getraenk");
		p1.setProductQuantity(getRandomInt(1200, 5000));
		p1.setProductUnit("Packung 1L");
		products.add(p1);

		ProductData p2 = new ProductData();
		p2.setProductID("10-" + getRandomInt(100000,999999));
		p2.setProductName("Vollkornbrot Alpenkorn");
		p2.setProductCategory("Backware");
		p2.setProductQuantity(getRandomInt(100, 800));
		p2.setProductUnit("Weckerl");
		products.add(p2);

		ProductData p3 = new ProductData();
		p3.setProductID("33-" + getRandomInt(100000,999999));
		p3.setProductName("Apfel Rot");
		p3.setProductCategory("Obst");
		p3.setProductQuantity(getRandomInt(500, 6000));
		p3.setProductUnit("Kiste 10kg");
		products.add(p3);

		ProductData p4 = new ProductData();
		p4.setProductID("00-316253");
		p4.setProductName("Persil Discs Color");
		p4.setProductCategory("Waschmittel");
		p4.setProductQuantity(getRandomInt(200, 800));
		p4.setProductUnit("Packung 700G");
		products.add(p4);

		data.setProductData(products);
		return data;
		
	}

}
