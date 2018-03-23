package com.ssm.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.entity.MyPage;
import com.ssm.entity.MyPage2;
import com.ssm.entity.User;
import com.ssm.entity.UserResult;
import com.ssm.entity.UsersResult;

@Controller
public class UserController {

	User user = new User();
	
	/*@RequestMapping("/users2")
    @ResponseBody
	public UsersResult getUsers( String pageNum , String pageSize){
		UsersResult usersResult = new UsersResult();
    	MyPage2 page = new MyPage2();
    	page.setPageNum(Integer.valueOf(pageNum) );
    	page.setPageSize(Integer.valueOf(pageSize));
		List userList = new ArrayList();
		
		for(int i=1; i <= 206;i++) {//模拟数据
			User user = new User();
			user.setId(i+"");
			user.setName("zhangsan"+i);
			user.setTelephone("0310-"+i);
			userList.add(user);
		}
		
		page.setTotalSize(userList.size());
		int p = userList.size() % page.getPageSize() == 0? userList.size() / page.getPageSize() : (userList.size() / page.getPageSize())+1 ;
		page.setTotalPage(p);
		
		int end = page.getPageNum()*page.getPageSize() > userList.size()?userList.size() : page.getPageNum()*page.getPageSize(); 
		
		List resultList = new ArrayList();
		
		resultList.addAll( userList.subList((page.getPageNum()-1)*page.getPageSize(), end) );
		
		
		usersResult.setPage(page);
		usersResult.setList(resultList);
		usersResult.setFlag("success");
		System.out.println("准备返回rrrr");
    	return usersResult;
	}
*/
	@RequestMapping("/users2")
    @ResponseBody
	public UsersResult getUsers(@RequestBody MyPage2 page){
		UsersResult usersResult = new UsersResult();
    	
		List userList = new ArrayList();
		
		String queryId = page.getQueryId();
		String queryName = page.getQueryName();
		String queryTele = page.getQueryTele();
		
		for(int i=1; i <= 206;i++) {//模拟数据
			User user = new User();
			user.setId(i+"");
			user.setName("zhangsan"+i);
			user.setTelephone("0310-"+i);
			
			
			
			if("".equals(queryId) & "".equals(queryTele) & "".equals(queryName) || queryId == null & queryId == null & queryId == null){
				userList.add(user);
			}else{
			
					if(user.getId().contains(queryId)&user.getName().contains(queryName)&user.getTelephone().contains(queryTele)){
						userList.add(user);
					
					/*}else if (user.getName().contains(queryName)) {
						userList.add(user);
					}else if(user.getTelephone().contains(queryTele)){
						userList.add(user);*/
				}
			}
		}
		
		
		page.setTotalSize(userList.size());
		int p = userList.size() % page.getPageSize() == 0? userList.size() / page.getPageSize() : (userList.size() / page.getPageSize())+1 ;
		page.setTotalPage(p);
		
		int end = page.getPageNum()*page.getPageSize() > userList.size()?userList.size() : page.getPageNum()*page.getPageSize(); 
		
		List resultList = new ArrayList();
		
		resultList.addAll( userList.subList((page.getPageNum()-1)*page.getPageSize(), end) );
		
		
		usersResult.setPage(page);
		usersResult.setList(resultList);
		usersResult.setFlag("success");
		System.out.println("准备返回rrrr");
    	return usersResult;
	}

}
