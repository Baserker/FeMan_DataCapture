package com.capture.data;

import com.capture.data.dao.FemanLabelDAO;
import com.capture.data.entity.FemanLabelEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private FemanLabelDAO femanLabelDAO;

	@Test
	public void contextLoads() {
		List<FemanLabelEntity> list=femanLabelDAO.findAll();
		System.out.println(list.size());
	}

}
