package com.mysite.sbb.answer;

import com.mysite.sbb.question.Question;
import com.mysite.sbb.user.SiteUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class AnswerService {
    private final AnswerRepository answerRepository;

    public Answer create(Question question, String content, SiteUser author){
        Answer answer=new Answer();

        answer.setCreateDate(LocalDateTime.now());
        answer.setContent(content);
        answer.setQuestion(question);
        answer.setAuthor(author);

        this.answerRepository.save(answer);
        return answer;
    }
}
