package health.weightlifting.Service;

import health.weightlifting.dto.ExerciseDTO;
import health.weightlifting.entity.Exercise;
import health.weightlifting.entity.Weight;
import health.weightlifting.repository.ExerciseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@RequiredArgsConstructor
@Service
@Log4j2
public class ExerciseServiceImpl implements ExerciseService {
    private final ExerciseRepository exerciseRepository;

    @Override
    @Transactional
    public Long register(ExerciseDTO exerciseDTO) {
        Exercise exercise = dtoToEntity(exerciseDTO);
        exerciseRepository.save(exercise);
        return exercise.getEno();
    }

    @Override
    public ExerciseDTO getExercise(Long mno){
        return null;
    }
}
