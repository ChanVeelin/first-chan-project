package com.ezen.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dao.OrderDAO;
import com.ezen.biz.dto.CartVO;
import com.ezen.biz.dto.OrderVO;

@Service("oderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDao;
	
	@Autowired
	private CartService cartService;
	
	@Override
	public int selectMaxOseq() {

		return orderDao.selectMaxOseq();
	}

	@Override
	public int insertOder(OrderVO vo) {
		// 1 신규 주문번호 채번
		int oseq = selectMaxOseq();
		vo.setOseq(oseq);
		//2 신규주문을 주문테이블에 생성
		orderDao.insertOder(vo);
		//3 장바구니 목록을읽어 oreder_detail 테이블에 저장
		List<CartVO> cartList = cartService.getlistCart(vo.getId());
		for(CartVO cart : cartList) {
			OrderVO order = new OrderVO();
			order.setOseq(oseq);
			order.setPseq(cart.getPseq());//상품 일련번호
			order.setQuantity(cart.getQuantity());//장바구니 상품 수량
				
			insertOrderDetail(order);
			//장바구니 테이블 업데이트  (처리결과 : 주문완료('2'))
			cartService.updateCart(cart.getCseq());
		}
		return oseq;
	}

	@Override
	public void insertOrderDetail(OrderVO vo) {
		
		orderDao.insertOrderDetail(vo);

	}

	@Override
	public List<OrderVO> getListOrderById(OrderVO vo) {
		
		return orderDao.ListOrderById(vo);
	}

	@Override
	public List<Integer> getSeqOrdering(OrderVO vo) {
		return orderDao.getSeqOrdering(vo);
	}

}
