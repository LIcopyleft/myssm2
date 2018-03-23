package com.ssm.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.entity.MyPage;
import com.ssm.entity.User;
import com.ssm.entity.UserResult;

@Controller
@ResponseBody
@RequestMapping("/easy")
public class UserController2 {
		
	@RequestMapping("/users")
    @ResponseBody
	public UserResult getUsers( String page , String rows){
		
		UserResult userResult = new UserResult();
    	MyPage myPage = new MyPage();
    	myPage.setPageNum(Integer.valueOf(page) );
    	myPage.setPageSize(Integer.valueOf(rows));
		Map resultmap = new HashMap();
		List userList = new ArrayList();
	
		for(int i= ((myPage.getPageNum()-1)*myPage.getPageSize())+1; i <= myPage.getPageSize() *myPage.getPageNum() ;i++) {
			
			User user = new User();
			user.setId(i+"");
			user.setName("zhangsan"+i);
			user.setTelephone("0310-"+i);
			userList.add(user);
			
		}
		
		userResult.setTotal(30);
		userResult.setRows(userList);
		
		resultmap.put("list",userList);
		resultmap.put("page", page);
		resultmap.put("flag","success");
		System.out.println("准备返回");
    	return userResult;
	}

	
	
	/*		
		@RequestMapping(value = "/users" , method = RequestMethod.POST)
	    @ResponseBody
		public UserResult getUsers(@ModelAttribute("myPage") MyPage myPage){
			UserResult userResult = new UserResult();
			Map resultmap = new HashMap();
			List userList = new ArrayList();
		
			for(int i= ((myPage.getPageNum()-1)*myPage.getPageSize())+1; i <= myPage.getPageSize() *myPage.getPageNum() ;i++) {
				
				User user = new User();
				user.setId(i+"");
				user.setName("zhangsan"+i);
				user.setTelephone("0310-"+i);
				userList.add(user);
				
			}
			
			userResult.setTotal(30);
			userResult.setRows(userList);
			
			resultmap.put("list",userList);
			resultmap.put("page", page);
			resultmap.put("flag","success");
			System.out.println("准备返回");
	    	return userResult;
		}
*/
	
}
