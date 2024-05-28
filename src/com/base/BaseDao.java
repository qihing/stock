package com.base;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.bean.User;

public class BaseDao {
	//获取cookic
    public static String   getCookic(HttpServletRequest request, String cookicname){
        Cookie cookie = null;
        Cookie[] cookies = null;
        // 获取当前域名下的cookies，是一个数组
        cookies = request.getCookies();
        if( cookies != null ){

            for (int i = 0; i < cookies.length; i++){
                cookie = cookies[i];

                if(cookie.getName().equals(cookicname)){
                    System.out.println(cookie.getValue());
                    return cookie.getValue();
                }
            }
        }
        return "";
    }

}
