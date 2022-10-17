package com.ant.application;

import com.ant.ProductService;
import com.ant.facade.application.ProductApplicationService;
import com.ant.facade.application.dto.ProductDTO;
import com.ant.infrastructure.common.api.Response;
import com.ant.interfaces.facade.ActivityApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 活动服务
 * </p>
 *
 * @Author Ant
 * @Date 2022/10/14 14:33
 */
@Service
public class ActivityService {

    Logger logger = LoggerFactory.getLogger(ActivityApi.class);

    @DubboReference
    private ProductApplicationService productApplicationService;

    public Response queryActivityByProductId(Long productId) {
        ProductDTO productById = productApplicationService.findProductById(productId);
        Response response = Response.ok(productById);

        logger.info("[GataWay]-result[{}]", response);
        return response;
    }
}
