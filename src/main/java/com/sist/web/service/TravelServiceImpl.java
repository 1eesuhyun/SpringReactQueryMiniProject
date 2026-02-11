package com.sist.web.service;
import org.springframework.stereotype.Service;

import com.sist.web.dto.AttractionDTO;
import com.sist.web.dto.CommonsDTO;
import com.sist.web.repository.*;
import lombok.RequiredArgsConstructor;
import java.util.*;

@Service
@RequiredArgsConstructor
public class TravelServiceImpl implements TravelService{
	private final SeoulRepository srepo;
	private final BusanRepository brepo;
	private final JejuRepository jrepo;
	// 메인 페이지 4개씩
	@Override
	public List<CommonsDTO> seoulListData4() {
		// TODO Auto-generated method stub
		return srepo.seoulListData4();
	}
	@Override
	public List<CommonsDTO> busanListData4() {
		// TODO Auto-generated method stub
		return brepo.busanListData4();
	}
	@Override
	public List<CommonsDTO> jejuListData4() {
		// TODO Auto-generated method stub
		return jrepo.jejuListData4();
	}
	// 제주 명소
	@Override
	public List<AttractionDTO> jejuAttratcionData(int start) {
		// TODO Auto-generated method stub
		return jrepo.jejuAttratcionData(start);
	}
	// 제주 총 페이지
	@Override
	public int jejuTotalPage(int contenttype) {
		// TODO Auto-generated method stub
		return jrepo.jejuTotalPage(contenttype);
	}
}
