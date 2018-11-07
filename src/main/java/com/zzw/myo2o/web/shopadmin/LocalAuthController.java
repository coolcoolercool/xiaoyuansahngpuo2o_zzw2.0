package com.zzw.myo2o.web.shopadmin;

import com.zzw.myo2o.entity.LocalAuth;
import com.zzw.myo2o.service.LocalAuthService;
import com.zzw.myo2o.util.CodeUtil;
import com.zzw.myo2o.util.HttPServletRequestUtil;
import com.zzw.myo2o.util.HttpServletRequestUtil2;
import com.zzw.myo2o.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * author: zzw5005
 * date: 2018/11/7 10:32
 */

@Controller
@RequestMapping(value="/shop", method={RequestMethod.GET, RequestMethod.POST})
public class LocalAuthController {
    @Autowired
    private LocalAuthService localAuthService;

    @RequestMapping("localauthlogincheck")
    @ResponseBody
    public Map<String, Object> localAuthLoginCheck(HttpServletRequest request){
        Map<String, Object> modelMap = new HashMap<>();

        //是否要要校验的标识
        boolean needVerify = HttPServletRequestUtil.getBoolean(request, "needVerify");

        //验证校验码
        if(needVerify && !CodeUtil.checkVerifyCode(request)){
            modelMap.put("success",false);
            modelMap.put("errMsg","验证码不正确,请重新输入");
            return modelMap;
        }

        //获取用户输入的用户名和密码
        String userName = HttPServletRequestUtil.getString(request, "userName");
        String password = HttPServletRequestUtil.getString(request, "password");

        if(userName != null && password != null){
            //数据库中的密码是MD5加密的,所以需要先将密码加密,然后再去调用后端的接口去数据库验证
            password = MD5.getMd5(password);
            LocalAuth localAuth = localAuthService.getLocalAuthByUserNameAndPwd(userName, password);
            if(localAuth != null){
                //将personInfo写入session中
                request.getSession().setAttribute("user", localAuth.getPersonInfo());
                modelMap.put("success", true);
                modelMap.put("errMsg","登陆成功");
            }else{
                modelMap.put("success", false);
                modelMap.put("errMsg","用户名或者密码不正确");
            }
        }else{
            modelMap.put("success",false);
            modelMap.put("errMsg","用户名和密码不能为空");
        }
        return modelMap;
    }

}
