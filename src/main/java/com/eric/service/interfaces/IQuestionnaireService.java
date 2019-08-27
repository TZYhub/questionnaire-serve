package com.eric.service.interfaces;

import com.eric.entity.Questionnaire;

import java.util.List;

public interface IQuestionnaireService {

    int saveQuestionnaire(Questionnaire questionnaire) throws Exception;

    int updateQuestionnaire(Questionnaire questionnaire) throws Exception;

    int deleteQuestionnaire(int questionnaireId) throws Exception;

    Questionnaire queryByQuestionnaireId(int questionnaireId) throws Exception;

    List<Questionnaire> queryQuestionnaireList(Questionnaire questionnaire) throws Exception;

}
