package Objects;

import java.util.ArrayList;

public class Category {
String category_id,name_ar,name_en,entery_date,desc_ar,_desc_enString;
ArrayList<Sub_Category>sub_Categories;
String name[]= {"category_id","name_ar","name_en","entery_date","desc_ar","desc_en"};
public ArrayList<Sub_Category> getSub_Categories() {
	return sub_Categories;
}

public void setSub_Categories(ArrayList<Sub_Category> sub_Categories) {
	this.sub_Categories = sub_Categories;
}

public String getCategory_id() {
	return category_id;
}

public void setCategory_id(String category_id) {
	this.category_id = category_id;
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

public String get_desc_enString() {
	return _desc_enString;
}

public void set_desc_enString(String _desc_enString) {
	this._desc_enString = _desc_enString;
}

}
