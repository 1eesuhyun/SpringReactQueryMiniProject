package com.sist.web.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.*;
import com.sist.web.dto.*;
import com.sist.web.entity.JejuTravel;

public interface JejuRepository extends JpaRepository<JejuTravel, Integer>{
	@Query(value = "SELECT contentid, title, address, image1, hit, contenttype "
			+ "FROM jejutravel "
			+ "ORDER BY contentid ASC "
			+ "OFFSET 0 ROWS FETCH NEXT 4 ROWS ONLY",nativeQuery = true)
	public List<CommonsDTO> jejuListData4();
}
