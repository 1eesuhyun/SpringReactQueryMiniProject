package com.sist.web.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sist.web.dto.AttractionDTO;
import com.sist.web.dto.CommonsDTO;

public interface TravelService {
	// 메인에 4개씩
	public List<CommonsDTO> seoulListData4();
	public List<CommonsDTO> busanListData4();
	public List<CommonsDTO> jejuListData4();
	
	// 제주 명소
	public List<AttractionDTO> jejuAttratcionData(int start);
	// 명소 총 페이지?
	public int jejuTotalPage(int contenttype);
}
