package com.sist.web.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.*;
import com.sist.web.dto.*;
import com.sist.web.entity.JejuTravel;

public interface JejuRepository extends JpaRepository<JejuTravel, Integer>{
	// 메인페이지 4개
	@Query(value = "SELECT contentid, title, address, image1, hit, contenttype "
			+ "FROM jejutravel "
			+ "ORDER BY contentid ASC "
			+ "OFFSET 0 ROWS FETCH NEXT 4 ROWS ONLY",nativeQuery = true)
	public List<CommonsDTO> jejuListData4();
	
	// 명소
	@Query(value = "SELECT j.contentid, title, address, image1, hit, j.contenttype, infocenter, restdate, usetime, parking, DBMS_LOB.SUBSTR(msg,49999,1) as msg, x, y "
			+ "FROM jejutravel j "
			+ "JOIN attraction a "
			+ "ON j.contentid = a.contentid "
			+ "ORDER BY contentid ASC "
			+ "OFFSET :start ROWS FETCH NEXT 12 ROWS ONLY",nativeQuery = true)
	public List<CommonsDTO> jejuAttratcionData(@Param("start") int start);
	// 명소 총 페이지?
	@Query(value = "SELECT CEIL (COUNT(*)/12.0) FROM jejutravel "
			+ "WHERE contenttype =:contenttype",nativeQuery = true)
	public int jejuTotalPage(@Param("contenttype") int contenttype);
	
	// 명소 상세보기
	@Query(value = "SELECT j.contentid, title, address, image1, hit, j.contenttype, x, y, "
			+ "infocenter, restdate, usetime, parking, CAST(DBMS_LOB.SUBSTR(msg, 4000, 1) AS VARCHAR2(4000)) AS msg "
			+ "FROM jejutravel j "
			+ "JOIN attraction a "
			+ "ON j.contentid = a.contentid "
			+ "AND j.contentid =:contentid",nativeQuery = true)
	public AttractionDTO jejuAttratcionDetail(@Param("contentid") int contentid);
}
