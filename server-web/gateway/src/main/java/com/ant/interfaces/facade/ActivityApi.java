package com.ant.interfaces.facade;


import com.ant.application.ActivityService;
import com.ant.infrastructure.common.api.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *  活动控制器
 * </p>
 *
 * @author Ant
 * @date 2022/10/09 10:09
 */
@Controller
@RequestMapping("/activity")
public class ActivityApi {
    Logger logger = LoggerFactory.getLogger(ActivityApi.class);

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    private final ActivityService activityService;

    public ActivityApi(ActivityService activityService) {
        this.activityService = activityService;
    }

    @RequestMapping(value = "/query")
    @ResponseBody
    public Response product(String productId) {
        logger.info("[API接口]-activity/query请求, 入参productId[{}]", productId);
        Long requestProductId = 1L;
        return activityService.queryActivityByProductId(requestProductId);
    }

    @GetMapping("product")
    public ModelAndView product() {
        logger.info("[API接口]-activity/product请求...");
        return new ModelAndView("product/detail", "message", message);
    }


}
