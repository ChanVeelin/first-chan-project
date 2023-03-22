package com.ezen.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dao.CartDAO;
import com.ezen.biz.dto.CartVO;

@Service("cartService")
public class CartServiceImpl implements CartService {

	
	@Autowired
	private CartDAO cartDao;
	
	@Override
	public void insertCart(CartVO vo) {
		cartDao.insertCart(vo);

	}

	@Override
	public List<CartVO> getlistCart(String id) {
	
		return cartDao.getlistCart(id);
	}

	@Override
	public void deleteCart(int cseq) {
		
		cartDao.deleteCart(cseq);
	}

	@Override
	public void updateCart(int cseq) {
	cartDao.updateCart(cseq);

	}

}
