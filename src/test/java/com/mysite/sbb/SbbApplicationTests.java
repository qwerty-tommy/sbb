package com.mysite.sbb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.mysite.sbb.answer.Answer;
import com.mysite.sbb.answer.AnswerRepository;
import com.mysite.sbb.answer.AnswerService;
import com.mysite.sbb.question.Question;
import com.mysite.sbb.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest

class SbbApplicationTests {

    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private AnswerRepository answerRepository;

    @Transactional
    @Test
    void testJpa() {

        Optional<Question> oq=this.questionRepository.findById(6);
        Question question=oq.get();

        Answer answer=new Answer();
        answer.setQuestion(question);
        answer.setContent("Yap, no needed.");
        answer.setCreateDate(LocalDateTime.now());

        this.answerRepository.save(answer);
    }
}