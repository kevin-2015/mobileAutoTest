package com.bmtc.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.bmtc.system.domain.ConfigDO;
import com.bmtc.system.domain.ConfigInfoDO;

/**
 * 系统配置接口
 * @author lpf7161
 */
@Mapper
public interface ConfigDao {
	
	// 通过系统配置id获取系统配置对象
	ConfigInfoDO get(Long id);
	
	// 查询系统配置数据
	List<ConfigInfoDO> list(Map<String,Object> map);
	
	// 统计系统配置总数
	int count(Map<String,Object> map);
	
	// 保存系统配置信息
	int save(ConfigDO config);
	
	// 更新系统配置信息
	int update(ConfigDO config);
	
	// 通过svn服务器IP地址查询svn相关的信息
	ConfigInfoDO getConfigInfo(String svnServer);
	
	// 删除配置信息
	int remove(Long configId);
	
	// 批量删除配置信息
	int batchRemove(Long[] configIds);
}
