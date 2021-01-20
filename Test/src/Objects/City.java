package Objects;

import java.util.ArrayList;

public class City {
String city_id,name_ar,name_en,zip_code,country_id,entery_date,desc_ar,desc_en;
String names[]= {"city_id","name_ar","name_en","zip_code","country_id","entery_date","desc_ar","desc_en"};
ArrayList<Sub_city>sub_citys;

public ArrayList<Sub_city> getSub_citys() {
	return sub_citys;
}

public void setSub_citys(ArrayList<Sub_city> sub_citys) {
	this.sub_citys = sub_citys;
}

public String getCity_id() {
	return city_id;
}

public void setCity_id(String city_id) {
	this.city_id = city_id;
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

public String getZip_code() {
	return zip_code;
}

public void setZip_code(String zip_code) {
	this.zip_code = zip_code;
}

public String getCountry_id() {
	return country_id;
}

public void setCountry_id(String country_id) {
	this.country_id = country_id;
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

}
