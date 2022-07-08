package com.cyh.smarthome.dal.user.model;

import lombok.Data;


@Data
public class User {

    /**
     * 用户ID
     */
    private String userID;

    /**
     * 用户名
     */
    private String userName;

	/**
	 * 密码
	 */
    private String userPassword;

	/**
	 * 手机号码
	 */
    private String userTelephone;

	/**
	 * 用户地址
	 */
    private String userAddress;

	/**
	 * 用户性别
	 */
    private String userGender;

	/**
	 * 所在家庭ID
	 */
    private String familyID;

	/**
	 * 是否删除
	 */
    private Integer userDeleteFlag;

}