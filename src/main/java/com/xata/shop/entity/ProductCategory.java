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

}
