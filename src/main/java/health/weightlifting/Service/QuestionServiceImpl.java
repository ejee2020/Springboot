package health.weightlifting.Service;
import health.weightlifting.dto.ExerciseDTO;
import health.weightlifting.dto.QuestionDTO;
import health.weightlifting.entity.Exercise;
import health.weightlifting.entity.Member;
import health.weightlifting.entity.MemberImage;
import health.weightlifting.entity.Question;
import health.weightlifting.repository.ExerciseRepository;
import health.weightlifting.repository.QuestionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Service
@Log4j2
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService{
    private final QuestionRepository questionRepository;
    @Override
    @Transactional
    public Long register(QuestionDTO questionDTO){
        Question question = dtoToEntity(questionDTO);
        questionRepository.save(question);
        return question.getQno();
    }

    @Override
    public QuestionDTO getQuestion(Long qno){
        return null;
    }

}
