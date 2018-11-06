package com.zzw.myo2o.service;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.zzw.myo2o.dto.WechatAuthExecution;
import com.zzw.myo2o.entity.WechatAuth;

public interface WechatAuthService {

	/**
	 * 
	 * @param openId
	 * @return
	 */
	WechatAuth getWechatAuthByOpenId(String openId);

	/**
	 * 
	 * @param wechatAuth
	 * @param profileImg
	 * @return
	 * @throws RuntimeException
	 */
	WechatAuthExecution register(WechatAuth wechatAuth,
                                 CommonsMultipartFile profileImg) throws RuntimeException;

}
