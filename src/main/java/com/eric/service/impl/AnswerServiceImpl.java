package com.eric.service.impl;

import com.eric.entity.Answer;
import com.eric.mapper.AnswerMapper;
import com.eric.service.interfaces.IAnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl implements IAnswerService {
    @Autowired(required = false)
    private AnswerMapper answerMapper;


    @Override
    public int saveAnswer(Answer answer) throws Exception {
        return answerMapper.insert(answer);
    }

    @Override
    public int updateAnswer(Answer answer) throws Exception {
        return answerMapper.updateByPrimaryKeySelective(answer);
    }

    @Override
    public int deleteAnswer(int answerId) throws Exception {
        return answerMapper.deleteByPrimaryKey(answerId);
    }

    @Override
    public Answer queryByAnswerId(int answerId) throws Exception {
        return answerMapper.selectByPrimaryKey(answerId);
    }

    @Override
    public List<Answer> queryAnswerList(Answer answer) throws Exception {
        return answerMapper.select(answer);
    }
}
