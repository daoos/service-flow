package com.service.flow.sample.common.test4;

import com.service.flow.api.DTO;
import com.service.flow.model.BaseTemp;

/**
 * @author zhangcb
 * @ClassName RefundTemp.java
 * @Description TODO
 * @createTime 2020年07月06日 07:30:00
 */
@DTO
public class RefundTemp extends BaseTemp {

    private String name;

    private String account;

    private String money;

    private String code;

    private String message;

    private String config;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }


    @Override
    public String toString() {
        return "RefundTemp{" +
                "name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", money='" + money + '\'' +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", config='" + config + '\'' +
                '}';
    }
}
