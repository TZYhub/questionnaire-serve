package com.eric.service.impl;

import com.eric.entity.Question;
import com.eric.mapper.QuestionMapper;
import com.eric.service.interfaces.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements IQuestionService {
    @Autowired(required = false)
    private QuestionMapper questionMapper;


    @Override
    public int saveQuestion(Question question) throws Exception {
        return questionMapper.insert(question);
    }

    @Override
    public int updateQuestion(Question question) throws Exception {
        return questionMapper.updateByPrimaryKeySelective(question);
    }

    @Override
    public int deleteQuestion(int questionId) throws Exception {
        return questionMapper.deleteByPrimaryKey(questionId);
    }

    @Override
    public Question queryByQuestionId(int questionId) throws Exception {
        return questionMapper.selectByPrimaryKey(questionId);
    }

    @Override
    public List<Question> queryQuestionList(Question question) throws Exception {
        return questionMapper.select(question);
    }
}
