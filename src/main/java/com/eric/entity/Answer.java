package com.eric.entity;

import java.util.Date;
import javax.persistence.*;

public class Answer {
    /**
     * 答案id
     */
    @Id
    @Column(name = "answer_id")
    private Integer answerId;

    /**
     * 回答的问题的问卷id
     */
    @Column(name = "questionnaire_id")
    private Integer questionnaireId;

    /**
     * 回答的问题id
     */
    @Column(name = "question_id")
    private Integer questionId;

    /**
     * 问题类型
1：单选
2：多选
3：简答
     */
    @Column(name = "question_type")
    private Integer questionType;

    /**
     * 回答时间
     */
    @Column(name = "answer_time")
    private Date answerTime;

    /**
     * 答题选项
1：选择题，来自question表的问题选项，单选题只有一个option，多选至少一个
[option1,option2,option3...]
2：简答题，至多一个元素的数组字符串
["只能有一个元素"]
若未达，则无元素
[]
     */
    @Column(name = "answer_option")
    private String answerOption;

    /**
     * 获取答案id
     *
     * @return answer_id - 答案id
     */
    public Integer getAnswerId() {
        return answerId;
    }

    /**
     * 设置答案id
     *
     * @param answerId 答案id
     */
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    /**
     * 获取回答的问题的问卷id
     *
     * @return questionnaire_id - 回答的问题的问卷id
     */
    public Integer getQuestionnaireId() {
        return questionnaireId;
    }

    /**
     * 设置回答的问题的问卷id
     *
     * @param questionnaireId 回答的问题的问卷id
     */
    public void setQuestionnaireId(Integer questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    /**
     * 获取回答的问题id
     *
     * @return question_id - 回答的问题id
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * 设置回答的问题id
     *
     * @param questionId 回答的问题id
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    /**
     * 获取问题类型
1：单选
2：多选
3：简答
     *
     * @return question_type - 问题类型
1：单选
2：多选
3：简答
     */
    public Integer getQuestionType() {
        return questionType;
    }

    /**
     * 设置问题类型
1：单选
2：多选
3：简答
     *
     * @param questionType 问题类型
1：单选
2：多选
3：简答
     */
    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    /**
     * 获取回答时间
     *
     * @return answer_time - 回答时间
     */
    public Date getAnswerTime() {
        return answerTime;
    }

    /**
     * 设置回答时间
     *
     * @param answerTime 回答时间
     */
    public void setAnswerTime(Date answerTime) {
        this.answerTime = answerTime;
    }

    /**
     * 获取答题选项
1：选择题，来自question表的问题选项，单选题只有一个option，多选至少一个
[option1,option2,option3...]
2：简答题，至多一个元素的数组字符串
["只能有一个元素"]
若未达，则无元素
[]
     *
     * @return answer_option - 答题选项
1：选择题，来自question表的问题选项，单选题只有一个option，多选至少一个
[option1,option2,option3...]
2：简答题，至多一个元素的数组字符串
["只能有一个元素"]
若未达，则无元素
[]
     */
    public String getAnswerOption() {
        return answerOption;
    }

    /**
     * 设置答题选项
1：选择题，来自question表的问题选项，单选题只有一个option，多选至少一个
[option1,option2,option3...]
2：简答题，至多一个元素的数组字符串
["只能有一个元素"]
若未达，则无元素
[]
     *
     * @param answerOption 答题选项
1：选择题，来自question表的问题选项，单选题只有一个option，多选至少一个
[option1,option2,option3...]
2：简答题，至多一个元素的数组字符串
["只能有一个元素"]
若未达，则无元素
[]
     */
    public void setAnswerOption(String answerOption) {
        this.answerOption = answerOption;
    }
}