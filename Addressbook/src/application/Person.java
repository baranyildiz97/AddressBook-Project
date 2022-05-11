//151805042 BARAN YILDIZ

package application;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


//Person attributes
public class Person {
	private int id;
	private String name;
	private String street;
	private String city;
	private String gender;
	private int zip;
	public Person(int id, String name, String street, String city, String gender, int zip) {
		super();
		this.id = id;
		//Name < 32
		if(name.length()>32) {
			Alert alertName=new Alert(AlertType.ERROR);
			alertName.setTitle("Error");
			alertName.setHeaderText("Name must be less than 32 characters!");
			alertName.show();
		}
		else {
			this.name = name;
		}
		
		//street < 32
		if(street.length()>32) {
			Alert alertStreet=new Alert(AlertType.ERROR);
			alertStreet.setTitle("Error");
			alertStreet.setHeaderText("Street must be less than 32 characters!");
			alertStreet.show();
		}
		else {
			this.street = street;
		}
		
		//city < 20
		if(city.length()>20) {
			Alert alertCity=new Alert(AlertType.ERROR);
			alertCity.setTitle("Error");
			alertCity.setHeaderText("City must be less than 20 characters!");
			alertCity.show();
		}
		else {
			this.city = city;
		}
		
		
		//Gender must be "F" or " M"
		if(gender.equals("F") !=false || gender.equals("M") !=false || gender.length()>1 ) {
			
			this.gender = gender;
		}
		else {
			
			Alert alertGender=new Alert(AlertType.ERROR);
			alertGender.setTitle("Error");
			alertGender.setHeaderText("Please enter valid gender!");
			alertGender.show();
			
		}
		
		//Zip number can not be between 9999 and 1000
		if(zip >9999 || zip<1000) {
			Alert alertZip=new Alert(AlertType.ERROR);
			alertZip.setTitle("Error");
			alertZip.setHeaderText("Please enter valid zip!");
			alertZip.show();
		}
		else {
			this.zip=zip;
		}
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	//Name < 32
	public void setName(String name) {
		if(name.length()>32) {
			Alert alertName=new Alert(AlertType.ERROR);
			alertName.setTitle("Error");
			alertName.setHeaderText("Name must be less than 32 characters!");
			alertName.show();
		}
		else {
			this.name = name;
		}
	}
	
	public String getStreet() {
		return street;
	}
	
	//street < 32
	public void setStreet(String street) {
		if(street.length()>32) {
			Alert alertStreet=new Alert(AlertType.ERROR);
			alertStreet.setTitle("Error");
			alertStreet.setHeaderText("Street must be less than 32 characters!");
			alertStreet.show();
		}
		else {
			this.street = street;
		}
	}
	public String getCity() {
		return city;
	}
	//city < 20
	public void setCity(String city) {
		if(city.length()>20) {
			Alert alertCity=new Alert(AlertType.ERROR);
			alertCity.setTitle("Error");
			alertCity.setHeaderText("City must be less than 20 characters!");
			alertCity.show();
		}
		else {
			this.city = city;
		}
	}
	public String getGender() {
		return gender;
	}
	
	//Gender must be "F" or " M"
	public void setGender(String gender) {

		if(gender.equals("F") !=false || gender.equals("M") !=false || gender.length()>1 ) {
			
			this.gender = gender;
		}
		else {
			
			Alert alertGender=new Alert(AlertType.ERROR);
			alertGender.setTitle("Error");
			alertGender.setHeaderText("Please enter valid gender!");
			alertGender.show();
			
		}
	}
	public int getZip() {
		return zip;
	}
	
	//Zip number can not be between 9999 and 1000
	public void setZip(int zip) {
		if(zip >9999 || zip<1000) {
			Alert alertZip=new Alert(AlertType.ERROR);
			alertZip.setTitle("Error");
			alertZip.setHeaderText("Please enter valid zip!");
			alertZip.show();
		}
		else {
			this.zip=zip;
		}
	}

}
