package com.bwsk.entity;

/**
 * 公司实体
 * @author lujian
 *
 */
public class Company {

	private int cid;//ID
	
	private String cname;//公司名称
	
	private String cabbreviation;//公司简称
	
	private String weixin;//绑定微信
	
	private int uid;//用户ID
	
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getCabbreviation() {
		return cabbreviation;
	}

	public void setCabbreviation(String cabbreviation) {
		this.cabbreviation = cabbreviation;
	}

	public String getWeixin() {
		return weixin;
	}

	public void setWeixin(String weixin) {
		this.weixin = weixin;
	}
	
	
}
