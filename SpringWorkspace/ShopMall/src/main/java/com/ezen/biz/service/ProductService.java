package com.ezen.biz.service;

import java.util.List;

import com.ezen.biz.dto.ProductVO;

public interface ProductService {

	ProductVO getProduct(ProductVO vo);

	List<ProductVO> getProductListByKind(String kind);

	List<ProductVO> getNewProductList();

	List<ProductVO> getBestProductList();

}