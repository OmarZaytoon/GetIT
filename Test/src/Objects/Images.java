package Objects;

public class Images {
String image_id,image_name,image_url,entery_date,staute;
Drives drive;
String name[]= {"image_id","image_name","image_url","entery_date","staute"};
public Drives getDrive() {
	return drive;
}

public void setDrive(Drives drive) {
	this.drive = drive;
}

public String getImage_id() {
	return image_id;
}

public void setImage_id(String image_id) {
	this.image_id = image_id;
}

public String getImage_name() {
	return image_name;
}

public void setImage_name(String image_name) {
	this.image_name = image_name;
}

public String getImage_url() {
	return image_url;
}

public void setImage_url(String image_url) {
	this.image_url = image_url;
}

public String getEntery_date() {
	return entery_date;
}

public void setEntery_date(String entery_date) {
	this.entery_date = entery_date;
}

public String getStaute() {
	return staute;
}

public void setStaute(String staute) {
	this.staute = staute;
}

}
