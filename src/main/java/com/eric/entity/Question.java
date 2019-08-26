package com.eric.entity;

import javax.persistence.*;

public class Question {
    /**
     * 问题id
     */
    @Id
    @Column(name = "question_id")
    private Integer questionId;

    /**
     * 归属的问卷id
     */
    @Column(name = "questionnaire_id")
    private Integer questionnaireId;

    /**
     * 问题的顺序
     */
    @Column(name = "question_sort_id")
    private Integer questionSortId;

    /**
     * 问题类型
1 单选题
2 多选题
3 填空题
     */
    @Column(name = "question_type")
    private Integer questionType;

    /**
     * 问题标题
     */
    @Column(name = "question_title")
    private String questionTitle;

    /**
     * 问题选项
1：选择题，数组字符串
[option1,option2,option3...]
2：简答题，空数组字符串
[]
     */
    @Column(name = "question_option")
    private String questionOption;

    /**
     * 获取问题id
     *
     * @return question_id - 问题id
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * 设置问题id
     *
     * @param questionId 问题id
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * 获取归属的问卷id
     *
     * @return questionnaire_id - 归属的问卷id
     */
    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    /**
     * 设置归属的问卷id
     *
     * @param questionnaireId 归属的问卷id
     */
    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    /**
     * 获取问题的顺序
     *
     * @return question_sort_id - 问题的顺序
     */
    public Integer getQuestionSortId() {
        return questionSortId;
    }

    /**
     * 设置问题的顺序
     *
     * @param questionSortId 问题的顺序
     */
    public void setQuestionSortId(Integer questionSortId) {
        this.questionSortId = questionSortId;
    }

    /**
     * 获取问题类型
1 单选题
2 多选题
3 填空题
     *
     * @return question_type - 问题类型
1 单选题
2 多选题
3 填空题
     */
    public Integer getQuestionType() {
        return questionType;
    }

    /**
     * 设置问题类型
1 单选题
2 多选题
3 填空题
     *
     * @param questionType 问题类型
1 单选题
2 多选题
3 填空题
     */
    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    /**
     * 获取问题标题
     *
     * @return question_title - 问题标题
     */
    public String getQuestionTitle() {
        return questionTitle;
    }

    /**
     * 设置问题标题
     *
     * @param questionTitle 问题标题
     */
    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    /**
     * 获取问题选项
1：选择题，数组字符串
[option1,option2,option3...]
2：简答题，空数组字符串
[]
     *
     * @return question_option - 问题选项
1：选择题，数组字符串
[option1,option2,option3...]
2：简答题，空数组字符串
[]
     */
    public String getQuestionOption() {
        return questionOption;
    }

    /**
     * 设置问题选项
1：选择题，数组字符串
[option1,option2,option3...]
2：简答题，空数组字符串
[]
     *
     * @param questionOption 问题选项
1：选择题，数组字符串
[option1,option2,option3...]
2：简答题，空数组字符串
[]
     */
    public void setQuestionOption(String questionOption) {
        this.questionOption = questionOption;
    }
}