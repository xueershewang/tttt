package com.moudel.test.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.moudel.test.entity.TestForm;
import com.moudel.test.mapper.TestFormMapper;



@Service
@Transactional
public class TestFormService extends ServiceImpl<TestFormMapper, TestForm>{
	private final  static Logger logger = LoggerFactory.getLogger(TestFormService.class);
	
	@Autowired
	private TestFormMapper testFormMapper;
	
	
}