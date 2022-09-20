package com.ant.controller.products;

import com.ant.domain.Products;
import com.ant.domain.result.CommonResult;
import com.ant.service.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * <p>
 * 商品控制器
 * </p>
 *
 * @author Ant
 * <href>gxstaxant@gmail.com</href>
 * @since 2021/10/9 6:36 下午
 */
@RestController
public class ProductsController implements WebMvcConfigurer {

    private final Logger log = LoggerFactory.getLogger(ProductsController.class);

    private final GoodsService goodsService;

    public ProductsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @CrossOrigin
    @RequestMapping(value = "/activity/query", method = RequestMethod.GET)
    public CommonResult activityQuery() {
        String no = "G1";
        final List<Products> goods = goodsService.activityQuery(no);
        log.info("result{}" , goods);
        return CommonResult.success(goods);
    }

//    @RequestMapping(value = "/activity/query", method = RequestMethod.GET)
//    public void activityQuery(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("/index");
//    }

}
