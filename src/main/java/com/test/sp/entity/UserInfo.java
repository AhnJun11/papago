package com.test.sp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user_info")
public class UserInfo {
	@Id
	@Column(name="ui_num")
	private Integer uiNum;
	@Column(name="ui_name")
	private String uiName;
	@Column(name="ui_id")
	private String uiId;
	@Column(name="ui_pwd")
	private String uiPwd;
	@Column(name="ui_genre")
	private String uiGenre;
	@Column(name="ui_email")
	private String uiEmail;
	@Column(name="ui_phone1")
	private String uiPhone1;
	@Column(name="ui_phone2")
	private String uiPhone2;
	@Column(name="ui_address")
	private String uiAddress;
	@Column(name="ui_hint")
	private String uiHint;
	@Column(name="ui_answer")
	private String uiAnswer;
	@Column(name="credat")
	private String credat;
	@Column(name="cretim")
	private String cretim;
	@Column(name="moddat")
	private String moddat;
	@Column(name="modtim")
	private String modtim;
	@Column(name="ui_img")
	private String uiImg;
}

