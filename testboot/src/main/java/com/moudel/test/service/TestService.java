package com.moudel.test.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.moudel.test.mapper.TestMapper;


@Service
public class TestService {

	//private Logger logger=Logger.getLogger(TestCioudpipeService.class);
	private final  static Logger logger = LoggerFactory.getLogger(TestService.class);
	
	@Autowired
	private TestMapper testMapper;
	
	
	//测试日志和json串返回
	public String testloger(String test){
		logger.info(test);
		Map<String,Object> map = new HashMap<String,Object>();
		List<Map<String,Object>> list = testMapper.selectuser();
		map.put("test", test);
		map.put("list", list);
		return JSONObject.toJSONString(map);
	}
	
	//测试数据库链接
	public String testmysql(){
		
		Map<String,Object> map = new HashMap<String,Object>();
		Integer in=testMapper.selectcount();
		List<Map<String,Object>> list = testMapper.selectuser();
		map.put("test", in);
		map.put("list", list);
		return JSONObject.toJSONString(map);
	}
	
//	//查询表名和对应的
//	public List testmysq12(){
//		
//		List list1=new ArrayList();
//	
//		
//		Map<String,Object> map = new HashMap<String,Object>();
//		//查询表名
//		List<Map<String,Object>> list = testMapper.selectuser12();
//		
//		List<String> tables = new ArrayList();
//		for(Map m :list){
//			String table = (String) m.get("Tables_in_keystone");
//			tables.add(table);
//		}
//		//查找表结构
//		for(String tablename:tables){
//			Map map1=new HashMap();
//			List<Map<String,Object>> list2=new ArrayList();
//			System.out.println(tablename);
//			if("group".equals(tablename)){
//				continue ;
//			}
//			list2 = testMapper.selectuser13(tablename);
//			//调用方法、构建excle标签页
//			map1.put("tablename", tablename);
//			map1.put("list2", list2);
//			list1.add(map1);
//		}
//
//		return list1;
//	}
//	
//	//查询数据结构
//		public String testmysq13(){
//			
//			Map<String,Object> map = new HashMap<String,Object>();
//			//查询表名
//			List<Map<String,Object>> list = testMapper.selectuser12();
//			
//			Map<String,Object> map2 = new HashMap<String,Object>();
//			List<String> tables = null;
//			for(Map m :list){
//				String table = (String) m.get("Tables_in_cloudpipe");
//				tables.add(table);
//			}
//			//查找表结构
//			for(String tablename:tables){
//				List<Map<String,Object>> list2 = testMapper.selectuser13(tablename);
//				//调用方法、构建excle标签页
//				
//			}
//			
//
//			return JSONObject.toJSONString(list);
//		}
//	
//	public String export(HttpServletRequest request,HttpServletResponse response) throws IOException{
//  		
////  		String test=testCioudpipeService.testmysq12();
//  		
//  		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
//  		Map<String,Object> map =new HashMap();
//  		map.put("Field", "1");
//  		map.put("Type", "2");
//  		map.put("Null", "3");
//  		map.put("Key", "4");
//  		map.put("Default", "5");
//  		map.put("Extra", "6");
//  		list.add(map);
//  		System.out.println(list);	
//  		String filename="人员信息";	
//  		// 创建一个Excel文档对象
//  		Workbook wb = new org.apache.poi.hssf.usermodel.HSSFWorkbook();
//  		// 创建一个Sheet
//  		Sheet sheet = wb.createSheet("hhhhhhhhh");
//  		
//    	// 创建一个表头
//		Row titleRow = sheet.createRow(0);
//		// 创建表头的每一个列
//		Cell name_cell = titleRow.createCell(0);
//		name_cell.setCellValue("Field");
//		
//		Cell p_cell = titleRow.createCell(1);
//		p_cell.setCellValue("Type");
//		
//		Cell s_cell = titleRow.createCell(2);
//		s_cell.setCellValue("Null");
//		
//		Cell a_cell = titleRow.createCell(3);
//		a_cell.setCellValue("Key");
//		
//		Cell c_cell = titleRow.createCell(4);
//		c_cell.setCellValue("Default");
//		
//		Cell t_cell = titleRow.createCell(5);
//		t_cell.setCellValue("Extra");
//		
//		// 创建Excel数据内容
//		Row item_row = null;
//		int i = 0;
//		
//		for (Map<String,Object> item : list){
//			item_row  = sheet.createRow(++i);
//			Cell name_cell1 = item_row.createCell(0);
//			name_cell1.setCellValue((String)item.get("Field"));
//			
//			Cell p_cell1 = item_row.createCell(1);
//			p_cell1.setCellValue((String)item.get("Type"));
//			
//			Cell s_cell1 = item_row.createCell(2);
//			s_cell1.setCellValue((String)item.get("Null"));
//			
//			Cell a_cell1 = item_row.createCell(3);
//			a_cell1.setCellValue((String)item.get("Key"));
//			
//			Cell c_cell1 = item_row.createCell(4);
//			c_cell1.setCellValue((String)item.get("Default"));
//			
//			Cell t_cell1 = item_row.createCell(5);
//			t_cell1.setCellValue((String)item.get("Extra"));
//		}
//
//  		response
//  			.setHeader("Content-Disposition","attachment;filename="+new String(filename.getBytes("utf-8"), "iso8859-1")+".xls");
//  			wb.write(response.getOutputStream());
//  		
//  		return null;
//  	}
}