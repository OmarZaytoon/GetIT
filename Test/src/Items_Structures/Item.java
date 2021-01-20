package Items_Structures;

import java.util.ArrayList; 
import java.util.HashMap;
import java.util.Map;
import Objects.*;
public class Item {
String item_id,entery_date,name,price,phone,status_id,expire_date,location,latiiude,longitude,like_number,dislike_number;
User user;
ArrayList<Images>images;
ArrayList<User>userlikesArray;
ArrayList<User>userdislikeArray;
HashMap<User, Float> rating;
ArrayList<User>views;
public ArrayList<User> getViews() {
	return views;
}
public void setViews(ArrayList<User> views) {
	this.views = views;
}
public ArrayList<User> getUserlikesArray() {
	return userlikesArray;
}
public void setUserlikesArray(ArrayList<User> userlikesArray) {
	this.userlikesArray = userlikesArray;
}
public ArrayList<User> getUserdislikeArray() {
	return userdislikeArray;
}
public void setUserdislikeArray(ArrayList<User> userdislikeArray) {
	this.userdislikeArray = userdislikeArray;
}
public HashMap<User, Float> getRating() {
	return rating;
}
public void setRating(HashMap<User, Float> rating) {
	this.rating = rating;
}
public String getItem_id() {
	return item_id;
}
public void setItem_id(String item_id) {
	this.item_id = item_id;
}
public String getEntery_date() {
	return entery_date;
}
public void setEntery_date(String entery_date) {
	this.entery_date = entery_date;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getStatus_id() {
	return status_id;
}
public void setStatus_id(String status_id) {
	this.status_id = status_id;
}
public String getExpire_date() {
	return expire_date;
}
public void setExpire_date(String expire_date) {
	this.expire_date = expire_date;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getLatiiude() {
	return latiiude;
}
public void setLatiiude(String latiiude) {
	this.latiiude = latiiude;
}
public String getLongitude() {
	return longitude;
}
public void setLongitude(String longitude) {
	this.longitude = longitude;
}
public String getLike_number() {
	return like_number;
}
public void setLike_number(String like_number) {
	this.like_number = like_number;
}
public String getDislike_number() {
	return dislike_number;
}
public void setDislike_number(String dislike_number) {
	this.dislike_number = dislike_number;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public ArrayList<Images> getImages() {
	return images;
}
public void setImages(ArrayList<Images> images) {
	this.images = images;
}
public float rateValue() {
	float avarage=0f;
	float sum=0f;
	int size=rating.size(); 
	for(Map.Entry m : rating.entrySet()){    
		 sum+=(float)m.getValue();
	 } 
	 avarage=(float)sum/size;
	return avarage;
} 
}
