package com.ezen.biz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.biz.dao.QnaDAO;
import com.ezen.biz.dto.QnaVO;


@Service("qnaService")
public class QnaServiceImpl implements QnaService {
	
	@Autowired
	private QnaDAO qdao;

	@Override
	public List<QnaVO> getListQna(String id) {
		return qdao.listQna(id);
	}

	@Override
	public QnaVO getQna(int qseq) {
		return qdao.getQna(qseq);
	}

	@Override
	public void insertQna(QnaVO vo) {
		qdao.insertQna(vo);
	}

}
