package com.ryan.springcloud.module.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author zhongziqi
 * @since 2021-09-15
 */
public class Payment extends Model<Payment> {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String serial;


    public Long getId() {
        return id;
    }

    public Payment setId(Long id) {
        this.id = id;
        return this;
    }

    public String getSerial() {
        return serial;
    }

    public Payment setSerial(String serial) {
        this.serial = serial;
        return this;
    }

    public static final String ID = "id";

    public static final String SERIAL = "serial";

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", serial=" + serial +
                "}";
    }
}
