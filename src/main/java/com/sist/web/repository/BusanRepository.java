package com.sist.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sist.web.dto.CommonsDTO;
import com.sist.web.entity.BusanTravel;

public interface BusanRepository extends JpaRepository<BusanTravel, Integer>{
	// 메인 4개씩 부산
	@Query(value = "SELECT contentid, title, address, image1, hit, contenttype "
			+ "FROM busantravel "
			+ "ORDER BY contentid ASC "
			+ "OFFSET 0 ROWS FETCH NEXT 4 ROWS ONLY",nativeQuery = true)
	public List<CommonsDTO> busanListData4();
}
