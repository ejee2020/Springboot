package health.weightlifting.Service;

import health.weightlifting.dto.ExerciseDTO;
import health.weightlifting.dto.MemberDTO;
import health.weightlifting.dto.WeightDTO;
import health.weightlifting.entity.Exercise;
import health.weightlifting.entity.Weight;

import java.time.LocalDateTime;

public interface ExerciseService {
    Long register(ExerciseDTO exerciseDTO);
    ExerciseDTO getExercise(Long eno);
    default Exercise dtoToEntity(ExerciseDTO exerciseDTO){
        Exercise exercise = Exercise.builder()
                .eno(exerciseDTO.getEno())
                .name(exerciseDTO.getName())
                .bodyPart(exerciseDTO.getBodyPart())
                .description(exerciseDTO.getDescription())
                .build();
        return exercise;
    }
    default ExerciseDTO entityToDTO(Exercise exercise){
        ExerciseDTO exerciseDTO = ExerciseDTO.builder()
                .eno(exercise.getEno())
                .name(exercise.getName())
                .bodyPart(exercise.getBodyPart())
                .description(exercise.getDescription())
                .build();
        return exerciseDTO;
    }
}
