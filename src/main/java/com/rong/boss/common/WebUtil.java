package com.rong.boss.common;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

public class WebUtil {

    private static final Logger log = LoggerFactory.getLogger(WebUtil.class);

    /**
     * 判断该请求是否是ajax请求
     * 对前端ajax请求有限制,需要存在http头:[x-requested-with:XMLHttpRequest]
     * @param httpServletRequest
     * @return
     */
    public static boolean isAjaxRequest(HttpServletRequest httpServletRequest) {
        return "XMLHttpRequest".equalsIgnoreCase(getRequestHeaderIgnoreCase
                (httpServletRequest, "x-requested-with"));
    }

    /**
     * 得到http头的内容,key大小写不敏感
     * @param httpServletRequest
     * @param headerName
     * @return
     */
    public static String getRequestHeaderIgnoreCase(HttpServletRequest httpServletRequest, String headerName) {
        for(Enumeration headerNames = httpServletRequest.getHeaderNames(); headerNames.hasMoreElements();) {
            String name = (String)headerNames.nextElement();
            if(!StringUtils.isBlank(name) && StringUtils.equalsIgnoreCase(headerName, name)) {
                return httpServletRequest.getHeader(name);
            }
        }
        return null;
    }

}
