package com.xata.shop.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
 
import com.xata.shop.entity.ProductCategory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
 
@Repository
@Transactional
public class ProductCategoryDAO {
 
    @Autowired
    private EntityManager entityManager;
 
    @SuppressWarnings("unchecked")
	public List<ProductCategory> getlistCategory() {
        String sql = ""
        		+ "	SELECT pc "
        		+ "	FROM " + ProductCategory.class.getName() + " pc " 
                + " WHERE pc.parentId = 0 "
                + "	ORDER BY pc.id";
 
        Query query = this.entityManager.createQuery(sql, ProductCategory.class);

        return query.getResultList();
    }
   
    @SuppressWarnings("unchecked")
	public List<ProductCategory> getlistSubCategory( int CategoryId) {
    	 String sql = ""
         		+ "	SELECT pc "
         		+ "	FROM " + ProductCategory.class.getName() + " pc " 
                + " WHERE pc.parentId = :parentId ";
 
        Query query = this.entityManager.createQuery(sql, ProductCategory.class);
        query.setParameter("parentId", CategoryId);
        return query.getResultList();
    }
 
}