package com.woniu.service;

import java.util.List;

import com.woniu.entity.PageBean;
import com.woniu.entity.Product;

public interface IProductService {

	void add(Product product);

	void del(Integer id);

	void revoke(Integer uid);

	void update(Product product);

	Product find(Integer id);

	List<Product> findAll(PageBean pb);

}
