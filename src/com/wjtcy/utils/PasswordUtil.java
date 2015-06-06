package com.wjtcy.utils;

import com.wjtcy.constants.CommonConstants;
import com.wjtcy.gglm.manager.encrypt.Encrypt;

public class PasswordUtil {

	/**
	 * 密码加密
	 * @param password
	 * @return
	 */
	public static String encPassword( String password ){
		Encrypt enc = new Encrypt() ;
		String enPassword = Md5Util.md5(password) ;
		enPassword = enc.encode(enPassword+CommonConstants.AdAdminPasswordSalt);
		return enPassword ;
	}
	
	/**
	 * 判断密码是否相同
	 * @param password
	 * @param enPwd
	 * @return
	 */
	public static boolean isEqual( String password,String enPwd ){
		if( null == password || "".equals(password.trim()) ){
			return false ;
		}
		Encrypt enc = new Encrypt() ;
		String enPassword = Md5Util.md5(password) ;
		enPassword = enc.encode(enPassword+CommonConstants.AdAdminPasswordSalt);
		if( enPassword.equals(enPwd) ){
			return true ;
		}
		return false ;
	}
}
