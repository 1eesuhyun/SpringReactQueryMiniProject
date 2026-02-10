package com.sist.web.controller;
import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sist.web.dto.CommonsDTO;
import com.sist.web.service.TravelService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class MainController {
	private final TravelService service;
	
	@GetMapping("/")
	public ResponseEntity<Map> main()
	{
		Map map=new HashMap();
		try
		{
			List<CommonsDTO> slist=service.seoulListData4();
			List<CommonsDTO> blist=service.busanListData4();
			List<CommonsDTO> jlist=service.jejuListData4();
			
			map.put("slist", slist);
			map.put("blist", blist);
			map.put("jlist", jlist);
		}catch(Exception ex)
		{
			ex.printStackTrace();
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(map,HttpStatus.OK);
	}
}
