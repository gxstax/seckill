package com.ant.domain.result;

import com.ant.domain.enums.BaseResultEnum;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * <p>
 * 功能描述
 * </p>
 *
 * @author GaoXin
 * @since 2021/10/19 2:10 下午
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommonResult<T> {
    /**
     * 状态码
     */
    private Integer code;

    /**
     * 状态信息
     */
    private String msg;

    /**
     * 数据集
     */
    private T data;

    /**
     * <p>
     * 是否成功
     * </p>
     *
     * @param
     * @return boolean
     */
    public boolean isSuccess() {
        return this.code.equals(BaseResultEnum.SUCCESS.getId());
    }

    /**
     * <p>
     * 成功(默认)
     * </p>
     *
     * @param
     * @return com.heytea.service.member.model.vo.CommonResult<T>
     */
    public static <T> CommonResult<T> success() {
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.code = BaseResultEnum.SUCCESS.getId();
        commonResult.msg = BaseResultEnum.SUCCESS.getMessage();
        return commonResult;
    }

    /**
     * <p>
     * 成功(带有数据返回)
     * </p>
     *
     * @param data
     * @return com.heytea.service.member.model.vo.CommonResult<T>
     */
    public static <T> CommonResult<T> success(T data) {
        CommonResult<T> commonResult = success();
        commonResult.data = data;
        return commonResult;
    }

    /**
     * <p>
     * 成功（带状态码和结果信息）
     * </p>
     *
     * @param code
     * @param message
     * @return CommonResult<T>
     */
    public static <T> CommonResult<T> success(Integer code, String message) {
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.code = code;
        commonResult.msg = message;
        return commonResult;
    }



    /**
     * 失败封装(带参数)
     *
     * @author Ant
     * @since 2019/7/17 18:40
     */
    public static <T> CommonResult<T> error(Integer code, String message) {
        CommonResult<T> commonResult = new CommonResult<>();
        commonResult.code = code;
        commonResult.msg = message;
        return commonResult;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }

}
