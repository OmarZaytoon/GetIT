package Objects;

import java.util.ArrayList;

public class Sub_Category {
String sub_category_id,name_ar,name_en,entery_Date,desc_ar,desc_en;
ArrayList<Sub_Sub_Category>sub_Sub_Categories;
public ArrayList<Sub_Sub_Category> getSub_Sub_Categories() {
	return sub_Sub_Categories;
}

public void setSub_Sub_Categories(ArrayList<Sub_Sub_Category> sub_Sub_Categories) {
	this.sub_Sub_Categories = sub_Sub_Categories;
}

public String getSub_category_id() {
	return sub_category_id;
}

public void setSub_category_id(String sub_category_id) {
	this.sub_category_id = sub_category_id;
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

public String getEntery_Date() {
	return entery_Date;
}

public void setEntery_Date(String entery_Date) {
	this.entery_Date = entery_Date;
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
