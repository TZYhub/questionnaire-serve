package com.eric.entity;

import javax.persistence.*;

@Table(name = "static_data")
public class StaticData {
    /**
     * 类型
     */
    @Id
    @Column(name = "data_type")
    private String dataType;

    /**
     * 值
     */
    @Id
    @Column(name = "data_value")
    private String dataValue;

    /**
     * 名称
     */
    @Column(name = "data_name")
    private String dataName;

    /**
     * 描述
     */
    @Column(name = "data_desc")
    private String dataDesc;

    /**
     * 获取类型
     *
     * @return data_type - 类型
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * 设置类型
     *
     * @param dataType 类型
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * 获取值
     *
     * @return data_value - 值
     */
    public String getDataValue() {
        return dataValue;
    }

    /**
     * 设置值
     *
     * @param dataValue 值
     */
    public void setDataValue(String dataValue) {
        this.dataValue = dataValue;
    }

    /**
     * 获取名称
     *
     * @return data_name - 名称
     */
    public String getDataName() {
        return dataName;
    }

    /**
     * 设置名称
     *
     * @param dataName 名称
     */
    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    /**
     * 获取描述
     *
     * @return data_desc - 描述
     */
    public String getDataDesc() {
        return dataDesc;
    }

    /**
     * 设置描述
     *
     * @param dataDesc 描述
     */
    public void setDataDesc(String dataDesc) {
        this.dataDesc = dataDesc;
    }
}