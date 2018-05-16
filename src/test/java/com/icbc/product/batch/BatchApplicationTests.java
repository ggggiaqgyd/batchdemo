package com.icbc.product.batch;

import com.icbc.product.batch.service.IFirstTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BatchApplicationTests {
	@Autowired
	private IFirstTest iFirstTest;
	@Test
	public void contextLoads() throws Exception {
		iFirstTest.imp("sample-data");
	}

}
