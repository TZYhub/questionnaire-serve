package com.eric.service.interfaces;

import com.eric.entity.Question;

import java.util.List;

public interface IQuestionService {

    int saveQuestion(Question question) throws Exception;

    int updateQuestion(Question question) throws Exception;

    int deleteQuestion(int questionId) throws Exception;

    Question queryByQuestionId(int questionId) throws Exception;

    List<Question> queryQuestionList(Question question) throws Exception;

}
