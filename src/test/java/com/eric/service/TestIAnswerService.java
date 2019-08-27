package com.eric.service;

import com.eric.QuestionnaireServeApplication;
import com.eric.entity.Answer;
import com.eric.service.interfaces.IAnswerService;
import com.eric.service.interfaces.IAnswerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = QuestionnaireServeApplication.class)
public class TestIAnswerService {
    @Autowired
    private IAnswerService answerService;

    @Test
    public void testSaveAnswer() throws Exception{
        Answer answer = new Answer();
        answer.setQuestionType(1);
        answer.setAnswerTime(new Date());
        answer.setQuestionId(11111);
        answer.setQuestionnaireId(10000001);
        answer.setAnswerOption("[1,2]");
        answerService.saveAnswer(answer);
    }

    @Test
    public void testUpdateAnswer() throws Exception{
        Answer answer = new Answer();
        answer.setAnswerId(1);
        answer.setQuestionType(2);
        answerService.updateAnswer(answer);
        System.out.println();
    }

    @Test
    public void testDeleteAnswer() throws Exception{
        System.out.println(answerService.deleteAnswer(1));
    }

    @Test
    public void testSelectAnswerList() throws Exception{
        Answer a = new Answer();
        a.setAnswerId(1);
        List<Answer> answers = answerService.queryAnswerList(a);
        for(Answer answer: answers){
            System.out.println(answer.getAnswerId());
        }
    }
}
