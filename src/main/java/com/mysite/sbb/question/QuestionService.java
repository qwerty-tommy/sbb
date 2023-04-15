package com.mysite.sbb.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.mysite.sbb.DataNotFoundException;

@RequiredArgsConstructor
@Service
public class QuestionService {
    final QuestionRepository questionRepository;

    public List<Question> getList() {
        return questionRepository.findAll();
    }

    public Question getQuestion(Integer id){
        Optional<Question> oq=questionRepository.findById(id);
        if (oq.isPresent()){
            return oq.get();
        } else{
            throw new DataNotFoundException("question no found");
        }
    }
}
