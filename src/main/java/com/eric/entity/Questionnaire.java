package com.eric.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import javax.persistence.*;

public class Questionnaire {
    /**
     * 问卷id
     */
    @Id
    @Column(name = "questionnaire_id")
    private Integer questionnaireId;

    private String titile;

    /**
     * 问卷状态
0：未发布
1：已发布
2：已结束
3：已删除
     */
    private Integer state;

    /**
     * 问卷回答人数
     */
    @Column(name = "answer_number")
    private Integer answerNumber;

    /**
     * 问卷创建时间
     */
    @Column(name = "create_time")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date createTime;

    /**
     * 问卷修改时间
     */
    @Column(name = "update_time")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date updateTime;

    /**
     * 创建用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 问卷开始发布时间
     */
    @Column(name = "start_time")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date startTime;

    /**
     * 问卷结束时间
     */
    @Column(name = "end_time")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", locale = "zh", timezone = "GMT+8")
    private Date endTime;

    /**
     * 获取问卷id
     *
     * @return questionnaire_id - 问卷id
     */
    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    /**
     * 设置问卷id
     *
     * @param questionnaireId 问卷id
     */
    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    /**
     * @return titile
     */
    public String getTitile() {
        return titile;
    }

    /**
     * @param titile
     */
    public void setTitile(String titile) {
        this.titile = titile;
    }

    /**
     * 获取问卷状态
0：未发布
1：已发布
2：已结束
3：已删除
     *
     * @return state - 问卷状态
0：未发布
1：已发布
2：已结束
3：已删除
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置问卷状态
0：未发布
1：已发布
2：已结束
3：已删除
     *
     * @param state 问卷状态
0：未发布
1：已发布
2：已结束
3：已删除
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * 获取问卷回答人数
     *
     * @return answer_number - 问卷回答人数
     */
    public Integer getAnswerNumber() {
        return answerNumber;
    }

    /**
     * 设置问卷回答人数
     *
     * @param answerNumber 问卷回答人数
     */
    public void setAnswerNumber(Integer answerNumber) {
        this.answerNumber = answerNumber;
    }

    /**
     * 获取问卷创建时间
     *
     * @return create_time - 问卷创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置问卷创建时间
     *
     * @param createTime 问卷创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取问卷修改时间
     *
     * @return update_time - 问卷修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置问卷修改时间
     *
     * @param updateTime 问卷修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建用户id
     *
     * @return user_id - 创建用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置创建用户id
     *
     * @param userId 创建用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取问卷开始发布时间
     *
     * @return start_time - 问卷开始发布时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置问卷开始发布时间
     *
     * @param startTime 问卷开始发布时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取问卷结束时间
     *
     * @return end_time - 问卷结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置问卷结束时间
     *
     * @param endTime 问卷结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
