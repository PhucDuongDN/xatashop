package com.xata.shop.entity;

import java.util.Currency;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "product_code", length = 50, nullable = true)
	private String productCode;
	
	@Column(name = "product_name", length = 255, nullable = true)
	private String productName;
	
	@Column(name = "description_short", nullable = true)
	private String descriptionShort;
	
	@Column(name = "description_detail", nullable = true)
	private Integer descriptionDetail;
	
	@Column(name = "product_image", length = 255, nullable = true)
	private String productImage;
	
	@Column(name = "more_images", length = 255, nullable = true)
	private String moreImages;
	
	@Column(name = "price", nullable = true)
	private Currency  price;
	
	@Column(name = "promotion_price", nullable = true)
	private Currency  promotionPrice;
	
	@Column(name = "tax", precision = 10, scale = 1, nullable = true)
	private Double tax;
	
	@Column(name = "quantity", nullable = true)
	private Integer  quantity;
	
	@Column(name = "category_id", nullable = true)
	private Integer  categoryId;
	
	@Column(name = "status", nullable = true)
	private Boolean status;
	
	@Column(name = "in_slidebar", nullable = true)
	private Boolean inSlidebar;
	
	@Column(name = "in_featured_product", nullable = true)
	private Boolean inFeaturedProduct;
	
	@Column(name = "in_latest_product", nullable = true)
	private Boolean inLatestProduct;
	
	@Column(name = "view_counts", nullable = true)
	private Integer  view_counts;
	
	@Column(name = "meta_keywords", length = 255, nullable = true)
	private String meta_keywords;
	
	@Column(name = "meta_descriptions", length = 255, nullable = true)
	private String meta_descriptions;
	
	@Column(name = "create_date", nullable = true)
	private Date create_date;

	@Column(name = "create_by", length = 50, nullable = true)
	private String create_by;

	@Column(name = "modified_date", nullable = true)
	private Date modified_date;

	@Column(name = "modified_by", length = 50, nullable = true)
	private String modified_by;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescriptionShort() {
		return descriptionShort;
	}

	public void setDescriptionShort(String descriptionShort) {
		this.descriptionShort = descriptionShort;
	}

	public Integer getDescriptionDetail() {
		return descriptionDetail;
	}

	public void setDescriptionDetail(Integer descriptionDetail) {
		this.descriptionDetail = descriptionDetail;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getMoreImages() {
		return moreImages;
	}

	public void setMoreImages(String moreImages) {
		this.moreImages = moreImages;
	}

	public Currency getPrice() {
		return price;
	}

	public void setPrice(Currency price) {
		this.price = price;
	}

	public Currency getPromotionPrice() {
		return promotionPrice;
	}

	public void setPromotionPrice(Currency promotionPrice) {
		this.promotionPrice = promotionPrice;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getInSlidebar() {
		return inSlidebar;
	}

	public void setInSlidebar(Boolean inSlidebar) {
		this.inSlidebar = inSlidebar;
	}

	public Boolean getInFeaturedProduct() {
		return inFeaturedProduct;
	}

	public void setInFeaturedProduct(Boolean inFeaturedProduct) {
		this.inFeaturedProduct = inFeaturedProduct;
	}

	public Boolean getInLatestProduct() {
		return inLatestProduct;
	}

	public void setInLatestProduct(Boolean inLatestProduct) {
		this.inLatestProduct = inLatestProduct;
	}

	public Integer getView_counts() {
		return view_counts;
	}

	public void setView_counts(Integer view_counts) {
		this.view_counts = view_counts;
	}

	public String getMeta_keywords() {
		return meta_keywords;
	}

	public void setMeta_keywords(String meta_keywords) {
		this.meta_keywords = meta_keywords;
	}

	public String getMeta_descriptions() {
		return meta_descriptions;
	}

	public void setMeta_descriptions(String meta_descriptions) {
		this.meta_descriptions = meta_descriptions;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public String getCreate_by() {
		return create_by;
	}

	public void setCreate_by(String create_by) {
		this.create_by = create_by;
	}

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

}
