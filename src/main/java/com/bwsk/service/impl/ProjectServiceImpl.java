package com.bwsk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bwsk.entity.Project;
import com.bwsk.mapper.ProjectMapper;
import com.bwsk.service.ProjectService;
import com.bwsk.util.Utils;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectMapper projectMapper;
	
	@Override
	public int insertOrUpdateProject(Project project) {
		// TODO Auto-generated method stub
		int row=0;
		if(project.getPid()>0) {//存在  修改
			row=projectMapper.updateProject(project);
		}else {//不存在 添加
			String currentTime=Utils.getCurrent();
			project.setCreattime(currentTime);
			row=projectMapper.insertProject(project);
		}
		return row;
	}

}
