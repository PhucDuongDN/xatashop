package com.xata.shop.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product_category")
public class ProductCategory {
	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Integer id;
	
	@Column(name = "name", length = 255, nullable = true)
	private String name;
	
	@Column(name = "parent_id", nullable = true)
	private Integer parentId;
	
	@Column(name = "display_order", nullable = true)
	private Integer displayOrder;
	
	@Column(name = "meta_title", length = 255, nullable = true)
	private String meta_title;
	
	@Column(name = "meta_keywords", length = 255, nullable = true)
	private String meta_keywords;
	
	@Column(name = "meta_descriptions", length = 255, nullable = true)
	private String meta_descriptions;
	
	@Column(name = "status", nullable = true)
	private Boolean status;
	
	@Column(name = "show_on_home", nullable = true)
	private Boolean show_on_home;
	
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getMeta_title() {
		return meta_title;
	}

	public void setMeta_title(String meta_title) {
		this.meta_title = meta_title;
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getShow_on_home() {
		return show_on_home;
	}

	public void setShow_on_home(Boolean show_on_home) {
		this.show_on_home = show_on_home;
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
