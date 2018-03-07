package com.bmtc.svn.domain;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

import com.bmtc.boc.domain.BocBaseDO;
import com.bmtc.svn.common.utils.TimeUtils;
import com.bmtc.svn.exception.BusinessException;


/**
 * SVN管理信息类
 * @author lpf7161
 *
 */
public class SvnManager extends BocBaseDO {
	
	private static Logger logger = Logger.getLogger(SvnManager.class);
	
	/**
	 * svn地址-本地代码存放位置
	 */
	//private Map<String, String> svnUrl_localCodePath = new HashMap<String, String>();
	private Map<String, String> svnUrl_localCodePath = null;
	
	/**
	 * svn 用户名
	 */
	private String svnUserName = null;
	
	/**
	 * svn 密码
	 */
	private String svnPassword = null;
	
	/**
	 * svn 开始提交时间
	 */
	private Timestamp startCommitDate = null;

	/**
	 * svn 结束提交时间
	 */
	private Timestamp endCommitDate = null;
	

	public String getSvnUserName() {
		return svnUserName;
	}

	public void setSvnUserName(String svnUserName) {
		this.svnUserName = svnUserName;
	}

	public String getSvnPassword() {
		return svnPassword;
	}

	public void setSvnPassword(String svnPassword) {
		this.svnPassword = svnPassword;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		SvnManager.logger = logger;
	}

	public Map<String, String> getSvnUrl_localCodePath() {
		return svnUrl_localCodePath;
	}

	public void setSvnUrl_localCodePath(Map<String, String> svnUrl_localCodePath) {
		this.svnUrl_localCodePath = svnUrl_localCodePath;
	}

	public void setStartCommitDate(Timestamp startCommitDate) {
		this.startCommitDate = startCommitDate;
	}

	public void setEndCommitDate(Timestamp endCommitDate) {
		this.endCommitDate = endCommitDate;
	}

	public Timestamp getStartCommitDate() {
		return startCommitDate;
	}

	public void setStartCommitDate(String startCommitDate) 
	{
		try 
		{
			if (!StringUtils.isEmpty(startCommitDate))
			{
				this.startCommitDate = TimeUtils.getTimestamp(startCommitDate);
			}
			else
			{
				this.startCommitDate = null;
			}
		} 
		catch (ParseException e) 
		{
			logger.error("parse date fail" + e);
			throw new BusinessException("0010","parse date fail");
		}
	}

	public Timestamp getEndCommitDate() {
		return endCommitDate;
	}

	public void setEndCommitDate(String endCommitDate) 
	{
		try 
		{
			if (!StringUtils.isEmpty(endCommitDate))
			{
				this.endCommitDate = TimeUtils.getTimestamp(endCommitDate);
			}
			else
			{
				this.endCommitDate = null;
			}
		} 
		catch (ParseException e) 
		{
			logger.error("parse date fail" + e);
			throw new BusinessException("0010","parse date fail");
		}
	}

	@Override
	public String toString() {
		return "SvnManager [svnUrls_localCodePath=" + svnUrl_localCodePath
				+ ", svnUserName=" + svnUserName + ", svnPassword="
				+ svnPassword + ", startCommitDate=" + startCommitDate
				+ ", endCommitDate=" + endCommitDate + "]";
	}

	public SvnManager(Map<String, String> svnUrls_localCodePath,
			String svnUserName, String svnPassword, Timestamp startCommitDate,
			Timestamp endCommitDate) {
		super();
		this.svnUrl_localCodePath = svnUrls_localCodePath;
		this.svnUserName = svnUserName;
		this.svnPassword = svnPassword;
		this.startCommitDate = startCommitDate;
		this.endCommitDate = endCommitDate;
	}

	public SvnManager() {
		super();
	}
	
}
