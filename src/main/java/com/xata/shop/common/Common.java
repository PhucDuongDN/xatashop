package com.xata.shop.common;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.xata.shop.dao.ProductCategoryDAO;
import com.xata.shop.entity.ProductCategory;

public class Common {
	public static Map<ProductCategory, List<ProductCategory>> getCategory( ProductCategoryDAO productCategoryDAO ) {

		List<ProductCategory> listCategory = productCategoryDAO.getlistCategory();
		Map<ProductCategory, List<ProductCategory>> category = new HashMap<ProductCategory, List<ProductCategory>>();
		for(int i = 0; i < listCategory.size(); i++) {
			if (listCategory.get(i) != null) {
				category.put(listCategory.get(i), productCategoryDAO.getlistSubCategory(listCategory.get(i).getId()));
			}
		}

		Map<ProductCategory, List<ProductCategory>> category_sort = category.entrySet()
				.stream()
				.sorted((o1, o2) -> o1.getKey().getId()
						.compareTo(o2.getKey().getId()))
				.collect(Collectors.toMap(Map.Entry::getKey,
						Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		return category_sort;
	}
}
