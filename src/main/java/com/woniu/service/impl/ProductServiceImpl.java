package com.woniu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.entity.PageBean;
import com.woniu.entity.Product;
import com.woniu.entity.ProductExample;
import com.woniu.mapper.ProductMapper;
import com.woniu.service.IProductService;
@Service
public class ProductServiceImpl implements IProductService {
	
	@Resource
	private ProductMapper productMapper;

	@Override
	@Transactional
	public void add(Product product) {
		// TODO Auto-generated method stub
		productMapper.insert(product);
	}

	@Override
	@Transactional
	public void del(Integer id) {
		Product product = new Product();
		product.setProductid(id);
		product.setStatus(0);
		productMapper.updateByPrimaryKeySelective(product);
	}

	@Override
	@Transactional
	public void update(Product product) {
		// TODO Auto-generated method stub
		productMapper.updateByPrimaryKey(product);
	}

	@Override
	@Transactional
	public Product find(Integer id) {
		// TODO Auto-generated method stub
		return productMapper.selectByPrimaryKey(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Product> findAll(PageBean pb) {
		// TODO Auto-generated method stub
		ProductExample pe = new ProductExample();
		List<Product> list =productMapper.selectByExample(null,new RowBounds(pb.getOffset(),pb.getLimit()));
		int count = (int) productMapper.countByExample(pe);
		pb.setCount(count);
		return list;
	}

	@Override
	@Transactional
	public void revoke(Integer id) {
		// TODO Auto-generated method stub
		Product product = new Product();
		product.setProductid(id);
		product.setStatus(1);
		productMapper.updateByPrimaryKeySelective(product);
	}

}
