package com.ant.domain.enums;

/**
 * <p>
 * 功能描述
 * </p>
 *
 * @author Ant
 * @since 2021/10/19 2:14 下午
 */
public enum BaseResultEnum implements IBaseEnum {

    SUCCESS(0, "SUCCESS", "操作成功"),

    ;
    private final int id;
    private final String code;
    private final String message;

    BaseResultEnum(int id, String code, String message) {
        this.id = id;
        this.code = code;
        this.message = message;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
