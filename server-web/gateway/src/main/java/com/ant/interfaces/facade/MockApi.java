package com.ant.interfaces.facade;

import com.ant.interfaces.application.dto.ProductDetailDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping( "/mock" )
public class MockApi {

    private static final Logger logger = LoggerFactory.getLogger(MockApi.class);

    /**
     * 商品详情页
     * @return
     */
    @RequestMapping(value = {"/product"}, method = {RequestMethod.POST, RequestMethod.GET})
    @ResponseBody
    public ProductDetailDTO product(String productId, HttpServletRequest request) {
        logger.info("MockController#product-params[{}]", productId);
        return new ProductDetailDTO().mock();
    }
}
