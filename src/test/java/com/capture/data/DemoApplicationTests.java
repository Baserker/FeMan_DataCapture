package com.capture.data;

import com.capture.data.dao.FemanLabelDAO;
import com.capture.data.entity.FemanLabelEntity;
import com.capture.data.service.FemanLabelService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private FemanLabelDAO femanLabelDAO;

	@Autowired
	private FemanLabelService femanLabelService;

	@Test
	public void contextLoads() {
		FemanLabelEntity model=new FemanLabelEntity();
		model.setParentId(0);
		model.setIsShow(1);
		Page<FemanLabelEntity> page=femanLabelService.findAll(0,5,model);
	}

}
