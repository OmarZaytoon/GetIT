package Objects;

import java.util.ArrayList;

import Objects.Items_Structure.Item;

public class User {
String userid,username,password,name,phone,email,latitiude,longitude,follower_number,entery_date;
Images image;
ArrayList<User>followers;
ArrayList<Shop>shops;
ArrayList<Item>items;
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

public ArrayList<Shop> getShops() {
	return shops;
}

public void setShops(ArrayList<Shop> shops) {
	this.shops = shops;
}

public String getEntery_date() {
	return entery_date;
}

public void setEntery_date(String entery_date) {
	this.entery_date = entery_date;
}

public Images getImage() {
	return image;
}

public void setImage(Images image) {
	this.image = image;
}

public String getUserid() {
	return userid;
}

public void setUserid(String userid) {
	this.userid = userid;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getLatitiude() {
	return latitiude;
}

public void setLatitiude(String latitiude) {
	this.latitiude = latitiude;
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
}
