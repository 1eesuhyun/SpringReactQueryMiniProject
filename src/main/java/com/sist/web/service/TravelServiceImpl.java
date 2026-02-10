package com.sist.web.service;
import org.springframework.stereotype.Service;
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
}
