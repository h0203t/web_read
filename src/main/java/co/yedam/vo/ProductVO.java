package co.yedam.vo;

import lombok.Data;

@Data
public class ProductVO {
	String prdCode;
	String prdName;
	String prdDesc;
	int originPrice;
	int salePrice;
	int starPoint;
	String prodImage;
}
