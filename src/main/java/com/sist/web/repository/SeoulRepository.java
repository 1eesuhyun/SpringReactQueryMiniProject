package com.sist.web.repository;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.sist.web.dto.CommonsDTO;
import com.sist.web.entity.SeoulTravel;

public interface SeoulRepository extends JpaRepository<SeoulTravel, Integer>{
	// 메인페이지 4개
	@Query(value = "SELECT contentid,title,address,image1,hit,contenttype "
			+ "FROM seoultravel "
			+ "ORDER BY contentid ASC "
			+ "OFFSET 0 ROWS FETCH NEXT 4 ROWS ONLY",nativeQuery = true)
	public List<CommonsDTO> seoulListData4();
}
