package Objects;
import java.util.ArrayList;
public class Country {
String country_id,name_ar,name_en,phone_id,entery_date,desc_ar,desc_en,zipcode;
String name[]= {"country_id","name_ar","name_en","phone_id","entery_date","desc_ar","desc_en","zip_code"};
ArrayList<City>cities;
public ArrayList<City> getCities() {
	return cities;
}

public void setCities(ArrayList<City> cities) {
	this.cities = cities;
}

public String getCountry_id() {
	return country_id;
}

public void setCountry_id(String country_id) {
	this.country_id = country_id;
}

public String getName_ar() {
	return name_ar;
}

public void setName_ar(String name_ar) {
	this.name_ar = name_ar;
}

public String getName_en() {
	return name_en;
}

public void setName_en(String name_en) {
	this.name_en = name_en;
}

public String getPhone_id() {
	return phone_id;
}

public void setPhone_id(String phone_id) {
	this.phone_id = phone_id;
}

public String getEntery_date() {
	return entery_date;
}

public void setEntery_date(String entery_date) {
	this.entery_date = entery_date;
}

public String getDesc_ar() {
	return desc_ar;
}

public void setDesc_ar(String desc_ar) {
	this.desc_ar = desc_ar;
}

public String getDesc_en() {
	return desc_en;
}

public void setDesc_en(String desc_en) {
	this.desc_en = desc_en;
}

public String getZipcode() {
	return zipcode;
}

public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

}
