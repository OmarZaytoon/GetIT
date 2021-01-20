package Objects;

public class Payment_details {
String payment_details_id,bank_exchanger,transaction_id,payment_vlaue,payment_date;
Sub_city bank_exchanger_location;
String name[]= {"payment_details_id","bank_exchanger","transaction_id","payment_vlaue","payment_date"};
public String getPayment_details_id() {
	return payment_details_id;
}
public void setPayment_details_id(String payment_details_id) {
	this.payment_details_id = payment_details_id;
}
public String getBank_exchanger() {
	return bank_exchanger;
}
public void setBank_exchanger(String bank_exchanger) {
	this.bank_exchanger = bank_exchanger;
}
public String getTransaction_id() {
	return transaction_id;
}
public void setTransaction_id(String transaction_id) {
	this.transaction_id = transaction_id;
}
public String getPayment_vlaue() {
	return payment_vlaue;
}
public void setPayment_vlaue(String payment_vlaue) {
	this.payment_vlaue = payment_vlaue;
}
public String getPayment_date() {
	return payment_date;
}
public void setPayment_date(String payment_date) {
	this.payment_date = payment_date;
}
public Sub_city getBank_exchanger_location() {
	return bank_exchanger_location;
}
public void setBank_exchanger_location(Sub_city bank_exchanger_location) {
	this.bank_exchanger_location = bank_exchanger_location;
}

}