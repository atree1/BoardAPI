package com.atree;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.atree.board.mapper.BoardMapper;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@Slf4j
@SpringBootTest
public class AtreeApplicationTests {

	
	@Autowired
	private BoardMapper m;
	@Test
	public void contextLoads() {
	}
	
	
	@Test
	public void dbConnectTest() throws Exception{
		log.info(""+m.selectBoardList());
	}

}
