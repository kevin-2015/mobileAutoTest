package com.bmtc.svn.domain;

import java.sql.Timestamp;

import com.bmtc.boc.domain.BocBaseDO;


/**
 * SVN用户和权限信息表
 * @author lpf7161
 *
 */
public class SvnUserAuthzInfo extends BocBaseDO {
	
	/**
	 * svn库名
	 */
	private String svnRepoName;
	
	/**
	 * svn仓库路径
	 */
	private String svnRepoPath;
	
	/**
	 * svn仓库url
	 */
	private String svnRepoUrl;
	
	/**
	 * svn仓库描述
	 */
	private String svnRepoDes;
	
	/**
	 * 用户真实姓名
	 */
	private String name;
	
	/**
	 * svn用户名
	 */
	private String svnUserName;
	
	/**
	 * svn密码
	 */
	private String svnPassword;
	
	/**
	 * svn库id
	 */
	private long svnRepoId;
	
	/**
	 * svn用户审批状态
	 * 0:待审批，1:已审批
	 */
	private long userStatus;

	/**
	 * svn用户创建时间
	 */
	private Timestamp svnUserCreateDate;
	
	/**
	 * svn用户修改时间
	 */
	private Timestamp svnUserModifyDate;
	
	/**
	 * svn用户权限id
	 */
	private long svnUserAuthzId;
	
	/**
	 * svn用户权限
	 */
	private String svnUserAuthz; 
	
	/**
	 * svn路径
	 */
	private String svnPath;
	
	/**
	 * svn用户id
	 */
	private long svnUserId;

	/**
	 * svn用户权限审批状态
	 * 0:待审批，1:已审批
	 */
	private long authzStatus;
	
	/**
	 * svn用户权限创建时间
	 */
	private Timestamp svnUserAuthzCreateDate;
	
	/**
	 * svn用户权限修改时间
	 */
	private Timestamp svnUserAuthzModifyDate;

	public String getSvnRepoName() {
		return svnRepoName;
	}

	public void setSvnRepoName(String svnRepoName) {
		this.svnRepoName = svnRepoName;
	}

	public String getSvnRepoPath() {
		return svnRepoPath;
	}

	public void setSvnRepoPath(String svnRepoPath) {
		this.svnRepoPath = svnRepoPath;
	}

	public String getSvnRepoUrl() {
		return svnRepoUrl;
	}

	public void setSvnRepoUrl(String svnRepoUrl) {
		this.svnRepoUrl = svnRepoUrl;
	}

	public String getSvnRepoDes() {
		return svnRepoDes;
	}

	public void setSvnRepoDes(String svnRepoDes) {
		this.svnRepoDes = svnRepoDes;
	}

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

	public long getSvnRepoId() {
		return svnRepoId;
	}

	public void setSvnRepoId(long svnRepoId) {
		this.svnRepoId = svnRepoId;
	}

	public long getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(long userStatus) {
		this.userStatus = userStatus;
	}

	public Timestamp getSvnUserCreateDate() {
		return svnUserCreateDate;
	}

	public void setSvnUserCreateDate(Timestamp svnUserCreateDate) {
		this.svnUserCreateDate = svnUserCreateDate;
	}

	public Timestamp getSvnUserModifyDate() {
		return svnUserModifyDate;
	}

	public void setSvnUserModifyDate(Timestamp svnUserModifyDate) {
		this.svnUserModifyDate = svnUserModifyDate;
	}

	public String getSvnUserAuthz() {
		return svnUserAuthz;
	}

	public void setSvnUserAuthz(String svnUserAuthz) {
		this.svnUserAuthz = svnUserAuthz;
	}

	public String getSvnPath() {
		return svnPath;
	}

	public void setSvnPath(String svnPath) {
		this.svnPath = svnPath;
	}

	public long getSvnUserId() {
		return svnUserId;
	}

	public void setSvnUserId(long svnUserId) {
		this.svnUserId = svnUserId;
	}

	public long getAuthzStatus() {
		return authzStatus;
	}

	public void setAuthzStatus(long authzStatus) {
		this.authzStatus = authzStatus;
	}

	public Timestamp getSvnUserAuthzCreateDate() {
		return svnUserAuthzCreateDate;
	}

	public void setSvnUserAuthzCreateDate(Timestamp svnUserAuthzCreateDate) {
		this.svnUserAuthzCreateDate = svnUserAuthzCreateDate;
	}

	public Timestamp getSvnUserAuthzModifyDate() {
		return svnUserAuthzModifyDate;
	}

	public void setSvnUserAuthzModifyDate(Timestamp svnUserAuthzModifyDate) {
		this.svnUserAuthzModifyDate = svnUserAuthzModifyDate;
	}

	public long getSvnUserAuthzId() {
		return svnUserAuthzId;
	}

	public void setSvnUserAuthzId(long svnUserAuthzId) {
		this.svnUserAuthzId = svnUserAuthzId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "SvnUserAuthzInfo [svnRepoName=" + svnRepoName
				+ ", svnRepoPath=" + svnRepoPath + ", svnRepoUrl=" + svnRepoUrl
				+ ", svnRepoDes=" + svnRepoDes + ", name=" + name
				+ ", svnUserName=" + svnUserName + ", svnPassword="
				+ svnPassword + ", svnRepoId=" + svnRepoId + ", userStatus="
				+ userStatus + ", svnUserCreateDate=" + svnUserCreateDate
				+ ", svnUserModifyDate=" + svnUserModifyDate
				+ ", svnUserAuthzId=" + svnUserAuthzId + ", svnUserAuthz="
				+ svnUserAuthz + ", svnPath=" + svnPath + ", svnUserId="
				+ svnUserId + ", authzStatus=" + authzStatus
				+ ", svnUserAuthzCreateDate=" + svnUserAuthzCreateDate
				+ ", svnUserAuthzModifyDate=" + svnUserAuthzModifyDate + "]";
	}

	public SvnUserAuthzInfo(String svnRepoName, String svnRepoPath,
			String svnRepoUrl, String svnRepoDes, String name,
			String svnUserName, String svnPassword, long svnRepoId,
			long userStatus, Timestamp svnUserCreateDate,
			Timestamp svnUserModifyDate, long svnUserAuthzId,
			String svnUserAuthz, String svnPath, long svnUserId,
			long authzStatus, Timestamp svnUserAuthzCreateDate,
			Timestamp svnUserAuthzModifyDate) {
		super();
		this.svnRepoName = svnRepoName;
		this.svnRepoPath = svnRepoPath;
		this.svnRepoUrl = svnRepoUrl;
		this.svnRepoDes = svnRepoDes;
		this.name = name;
		this.svnUserName = svnUserName;
		this.svnPassword = svnPassword;
		this.svnRepoId = svnRepoId;
		this.userStatus = userStatus;
		this.svnUserCreateDate = svnUserCreateDate;
		this.svnUserModifyDate = svnUserModifyDate;
		this.svnUserAuthzId = svnUserAuthzId;
		this.svnUserAuthz = svnUserAuthz;
		this.svnPath = svnPath;
		this.svnUserId = svnUserId;
		this.authzStatus = authzStatus;
		this.svnUserAuthzCreateDate = svnUserAuthzCreateDate;
		this.svnUserAuthzModifyDate = svnUserAuthzModifyDate;
	}

	public SvnUserAuthzInfo() {
		super();
	}

	
}
