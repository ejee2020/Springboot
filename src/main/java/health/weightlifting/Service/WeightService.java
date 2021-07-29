package health.weightlifting.Service;

import health.weightlifting.dto.WeightDTO;
import health.weightlifting.entity.Exercise;
import health.weightlifting.entity.Weight;

import java.util.List;

public interface WeightService {
    Long register(WeightDTO weightDTO);
    WeightDTO getWeight(Long wno);
    public List<WeightDTO> getListOfWeight(Long mno);
    default Weight dtoToEntity(WeightDTO weightDTO){
        Weight weight = Weight.builder()
                .wno(weightDTO.getWno())
                .reps(weightDTO.getReps())
                .weight(weightDTO.getWeight())
                .build();
        return weight;
    }
    default WeightDTO entityToDTO(Weight weight){
        WeightDTO weightDTO = WeightDTO.builder()
                .wno(weight.getWno())
                .reps(weight.getReps())
                .weight(weight.getWeight())
                .build();
        return weightDTO;
    }
}
