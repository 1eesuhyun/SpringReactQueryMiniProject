package com.sist.web.service;

import java.util.List;

import com.sist.web.dto.CommonsDTO;

public interface TravelService {
	// 메인에 4개씩
	public List<CommonsDTO> seoulListData4();
	public List<CommonsDTO> busanListData4();
	public List<CommonsDTO> jejuListData4();
	
	
}
