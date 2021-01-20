package Objects;
import Objects.Items_Structure.Item;
public class Advertisement {
String advertisement_id,expire_date,entery_date,discount_value,payment_type;
Item item;
String names[]= {"advertisement_id","expire_date","entery_date","discount_value","payment_type"};
public Item getItem() {
	return item;
}

public void setItem(Item item) {
	this.item = item;
}

public String getAdvertisement_id() {
	return advertisement_id;
}

public void setAdvertisement_id(String advertisement_id) {
	this.advertisement_id = advertisement_id;
}

public String getExpire_date() {
	return expire_date;
}

public void setExpire_date(String expire_date) {
	this.expire_date = expire_date;
}

public String getEntery_date() {
	return entery_date;
}

public void setEntery_date(String entery_date) {
	this.entery_date = entery_date;
}

public String getDiscount_value() {
	return discount_value;
}

public void setDiscount_value(String discount_value) {
	this.discount_value = discount_value;
}

public String getPayment_type() {
	return payment_type;
}

public void setPayment_type(String payment_type) {
	this.payment_type = payment_type;
}

}
