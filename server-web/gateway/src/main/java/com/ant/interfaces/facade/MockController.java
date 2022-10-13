package com.ant.interfaces.facade;

import com.ant.ProductService;
import com.ant.domain.dto.ProductDetailDTO;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping( "/mock" )
public class MockController {

    @DubboReference
    private ProductService productService;

    /**
     * 商品详情页
     * @return
     */
    @RequestMapping(value = {"/product"}, method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ProductDetailDTO product(String productId, HttpServletRequest request) {
        return new ProductDetailDTO().mock();
    }
}
