package com.zzw.myo2o.web.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * author: zzw5005
 * date: 2018/10/31 21:38
 */

@Controller
@RequestMapping("/frontend")
public class FrontEndController {

    /**
     * 首页路由
     * @return
     */
    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index(){
        return "frontend/index";
    }

    /**
     * 店铺列表路由
     * @return
     */
    @RequestMapping(value="/shoplist",method=RequestMethod.GET)
    public String showShopList(){
        return "frontend/shoplist";
    }

    /**
     * 店铺详情页路由
     * @return
     */
    @RequestMapping(value="/shopdetail", method=RequestMethod.GET)
    private String showShopDetail(){
        return "frontend/shopdetail";
    }

    /**
     * 商品详情页路由
     * @return
     */
    @RequestMapping(value="/productdetail", method=RequestMethod.GET)
    private String showProductDetail(){
        return "frontend/productdetail";
    }


}
