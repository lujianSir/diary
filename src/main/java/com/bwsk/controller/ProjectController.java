package com.bwsk.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bwsk.entity.Project;
import com.bwsk.entity.User;
import com.bwsk.service.ProjectService;
import com.bwsk.service.UserService;
import com.bwsk.util.Result;
/**
 * 用户相关的接口
 * @author lujian
 *
 */
@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	 
	/**
	 * 添加或者修改项目信息
	 * @param user
	 * @return
	 */
	@RequestMapping("/insertOrUpdateProject")
	public Result<?> insertOrUpdateProject(Project project) {	
		project.setPname("崇阳项目");
		project.setPabbreviation("崇阳宁");
		project.setPnumber("czcxzvz");
		project.setPaddress("湖北崇阳");
		project.setPstatus(1);
		project.setCid(5);
		project.setPtype(1);
		BigDecimal contractamount=new BigDecimal("450");
		project.setContractamount(contractamount);
		BigDecimal acceptedamount=new BigDecimal("240");
		project.setAcceptedamount(acceptedamount);
		BigDecimal acceptedinvoice=new BigDecimal("130");
		project.setAcceptedinvoice(acceptedinvoice);
		project.setTotalartificial(10);
		project.setApproachDay("2010-3-3");
		project.setCompleteDay("2018-8-3");
		project.setPaycondition("非要全部成功");
		project.setFineremarks("晚一天扣1000");
		project.setUid(3);
		int row=projectService.insertOrUpdateProject(project);
		if(row>0) {
			return	Result.success("操作成功");
		}else {
			return Result.error(500, "服务端错误");
		}	
	}
		
}
