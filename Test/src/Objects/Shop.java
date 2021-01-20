package Objects;

import java.util.ArrayList;

import Objects.Items_Structure.Item;
public class Shop {
String store_id,entery_date,name_ar,name_en,address,main_shop,shop_phone,shop_phone2,latitude,longitude,follower_number,staus,image;
String name[]= {"store_id","entery_date","name_ar","name_en","address","main_shop","shop_phone","shop_phone2","latitude","longitude","follower_number","staus","image"};
ArrayList<Item>items;
ArrayList<User>followers;
ArrayList<User>admins;
ArrayList<User>employees;
public String getStore_id() {
	return store_id;
}
public void setStore_id(String store_id) {
	this.store_id = store_id;
}
public String getEntery_date() {
	return entery_date;
}
public void setEntery_date(String entery_date) {
	this.entery_date = entery_date;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMain_shop() {
	return main_shop;
}
public void setMain_shop(String main_shop) {
	this.main_shop = main_shop;
}
public String getShop_phone() {
	return shop_phone;
}
public void setShop_phone(String shop_phone) {
	this.shop_phone = shop_phone;
}
public String getShop_phone2() {
	return shop_phone2;
}
public void setShop_phone2(String shop_phone2) {
	this.shop_phone2 = shop_phone2;
}
public String getLatitude() {
	return latitude;
}
public void setLatitude(String latitude) {
	this.latitude = latitude;
}
public String getLongitude() {
	return longitude;
}
public void setLongitude(String longitude) {
	this.longitude = longitude;
}
public String getFollower_number() {
	return follower_number;
}
public void setFollower_number(String follower_number) {
	this.follower_number = follower_number;
}
public String getStaus() {
	return staus;
}
public void setStaus(String staus) {
	this.staus = staus;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public ArrayList<Item> getItems() {
	return items;
}
public void setItems(ArrayList<Item> items) {
	this.items = items;
}
public ArrayList<User> getFollowers() {
	return followers;
}
public void setFollowers(ArrayList<User> followers) {
	this.followers = followers;
}
public ArrayList<User> getAdmins() {
	return admins;
}
public void setAdmins(ArrayList<User> admins) {
	this.admins = admins;
}
public ArrayList<User> getEmployees() {
	return employees;
}
public void setEmployees(ArrayList<User> employees) {
	this.employees = employees;
}
}
