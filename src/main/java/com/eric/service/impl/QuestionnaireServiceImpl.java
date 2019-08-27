package com.eric.service.impl;

import com.eric.entity.Questionnaire;
import com.eric.mapper.QuestionnaireMapper;
import com.eric.service.interfaces.IQuestionnaireService;
import com.eric.service.interfaces.IQuestionnaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService {
    @Autowired(required = false)
    private QuestionnaireMapper questionnaireMapper;


    @Override
    public int saveQuestionnaire(Questionnaire questionnaire) throws Exception {
        return questionnaireMapper.insert(questionnaire);
    }

    @Override
    public int updateQuestionnaire(Questionnaire questionnaire) throws Exception {
        return questionnaireMapper.updateByPrimaryKeySelective(questionnaire);
    }

    @Override
    public int deleteQuestionnaire(int questionnaireId) throws Exception {
        return questionnaireMapper.deleteByPrimaryKey(questionnaireId);
    }

    @Override
    public Questionnaire queryByQuestionnaireId(int questionnaireId) throws Exception {
        return questionnaireMapper.selectByPrimaryKey(questionnaireId);
    }

    @Override
    public List<Questionnaire> queryQuestionnaireList(Questionnaire questionnaire) throws Exception {
        return questionnaireMapper.select(questionnaire);
    }
}
