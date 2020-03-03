package com.bwsk.mapper;

import org.springframework.stereotype.Repository;

import com.bwsk.entity.Project;

@Repository
public interface ProjectMapper {

	//添加项目
	public int insertProject(Project project);
	
	//修改项目
	public int updateProject(Project project);
}
