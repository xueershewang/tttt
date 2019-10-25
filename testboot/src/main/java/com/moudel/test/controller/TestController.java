package com.moudel.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moudel.test.mapper.TestMapper;
import com.moudel.test.service.TestFormService;
import com.moudel.test.service.TestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 测试接口类
 * @author dell
 *
 */
@Api(tags = "测试接口",value = "测试接口")
@RestController
public class TestController {
	private final  static Logger logger =  LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private TestService testService;
	@Autowired
	private TestFormService testFormService;
	
	
	
	/**
	 * 测试mybaties-plus
	 * @return
	 * http://localhost:8080/test/test2
	 */
	@GetMapping(value="test/test2")
	public String test2(){
		logger.info("测试mybaties-plus");
		
		
		logger.info("测试mybaties-plus:"+testFormService.count()+testFormService.list());                    
		                       
		
		
		return"测试mybaties-plus";
	}
	
	/**
	 * 测试接口
	 * @return
	 * http://localhost:8080/test/test
	 */
    @ApiOperation(value = "测试接口--Testcioudpipe--test", notes = "测试接口--Testcioudpipe--test")
    @ApiResponses({@ApiResponse(code = 200, message = "OK"), @ApiResponse(code = 400, message = "invalid parameters"),
            @ApiResponse(code = 401, message = "unauthorized"), @ApiResponse(code = 403, message = "forbidden"),
            @ApiResponse(code = 500, message = "insert function error")})

	@GetMapping(value="test/test")
	public String test(){
		logger.info("logger=====测试接口--Testcioudpipe--test");
		return "测试接口--Testcioudpipe--test";
	}
	
	/**
	 * 测试接口
	 * @return
	 * http://localhost:8080/test/test1
	 */
	@GetMapping(value="test/test1")
	public String test1(){
		logger.info("logger=====测试接口--Testcioudpipe--test");
		return testService.testmysql();
	}
	
}
