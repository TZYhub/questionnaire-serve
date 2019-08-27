package com.eric.service.interfaces;

import com.eric.entity.Answer;

import java.util.List;
import java.util.Map;

public interface IAnswerService {

    int saveAnswer(Answer answer) throws Exception;

    int updateAnswer(Answer answer) throws Exception;

    int deleteAnswer(int answerId) throws Exception;

    Answer queryByAnswerId(int answerId) throws Exception;

    List<Answer> queryAnswerList(Answer answer) throws Exception;

}
