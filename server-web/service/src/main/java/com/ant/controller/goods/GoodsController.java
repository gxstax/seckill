package com.ant.controller.goods;

import com.ant.domain.Goods;
import com.ant.service.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.Map;

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
public class GoodsController implements WebMvcConfigurer {

    private final Logger log = LoggerFactory.getLogger(GoodsController.class);

    private final GoodsService goodsService;

    public GoodsController(GoodsService goodsService) {
        this.goodsService = goodsService;
    }

    @CrossOrigin
    @RequestMapping(value = "/activity/query", method = RequestMethod.GET)
    public List<Goods> activityQuery() {
        String no = "G1";
        final List<Goods> goods = goodsService.activityQuery(no);
        log.info("result{}" , goods);
        return goods;
    }

//    @RequestMapping(value = "/activity/query", method = RequestMethod.GET)
//    public void activityQuery(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("/index");
//    }

}
