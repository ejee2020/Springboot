package health.weightlifting.Service;
import health.weightlifting.dto.*;
import health.weightlifting.entity.Exercise;
import health.weightlifting.entity.Member;
import health.weightlifting.entity.MemberImage;
import health.weightlifting.entity.Question;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public interface QuestionService {
    Long register(QuestionDTO questionDTO);
    QuestionDTO getQuestion(Long qno);
    default Question dtoToEntity(QuestionDTO questionDTO){
        Question question = Question.builder()
                .qno(questionDTO.getQno())
                .title(questionDTO.getTitle())
                .content(questionDTO.getContent())
                .build();
        return question;
    }
    default QuestionDTO entityToDTO(Question question){
        QuestionDTO questionDTO = QuestionDTO.builder()
                .qno(question.getQno())
                .title(question.getTitle())
                .content(question.getContent())
                .build();
        return questionDTO;
    }
}
