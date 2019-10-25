package com.moudel.test.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 
 * @author dell
 *
 */
@Mapper
public interface TestMapper {

	//测试链接
	public Integer selectcount();
	public List<Map<String,Object>> selectuser();
	//查询表名
//	public List<Map<String,Object>> selectuser12();
//	//查询表名
//	public List<Map<String,Object>> selectuser13(@Param("tablename") String tablename);
//	
//	@Select("select id from test_user")
//	public List<Map<String,Object>> selectuserid();
}
