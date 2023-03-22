package com.ezen.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dao.ProductDAO;
import com.ezen.biz.dto.ProductVO;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO pDao;
	@Override
	public ProductVO getProduct(ProductVO vo) {

		return pDao.getProduct(vo);
	}

	@Override
	public List<ProductVO> getProductListByKind(String kind) {

		return pDao.getProductListByKind(kind);
	}

	@Override
	public List<ProductVO> getNewProductList() {

		return pDao.getNewProductList();
	}

	@Override
	public List<ProductVO> getBestProductList() {

		return pDao.getBestProductList();
	}

}
