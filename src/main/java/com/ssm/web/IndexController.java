/*package com.ssm.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.entity.MyPage;
import com.ssm.entity.User;

@Controller
@RequestMapping("/user")
public class IndexController {
	
	
	@RequestMapping("/index")
	public String index(){
		
		return "index";
	}
	
	
	@RequestMapping("/getusers")
    @ResponseBody
	public Map getUsers( String pageNum , String pageSize){
		User user = new User();
    	MyPage page = new MyPage();
    	page.setPageNum(Integer.valueOf(pageNum) );
    	page.setPageSize(Integer.valueOf(pageSize));
		Map resultmap = new HashMap();
		List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
		
		for (int i = 0; i < 50; i++) {
			user.setId(i+"");
			user.setName("zhangsan"+i);
			user.setTelephone("0310-"+1);
		}
		
		
		Map m = null;
		for(int i= ((page.getPageNum()-1)*page.getPageSize())+1; i <= page.getPageSize() *page.getPageNum() ;i++) {
			m = new HashMap<String , Object>();
			m.put("id", user.getId());
			m.put("name",user.getName());
			m.put("telephone",user.getTelephone());
			//list.add(m);
		}
		return m;
		resultmap.put("list",list);
		resultmap.put("page", page);
		resultmap.put("flag","success");
		System.out.println("准备返回");
    	return resultmap;
	}

}
*/