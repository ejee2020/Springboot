package health.weightlifting.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WeightDTO {
    private Long wno;
    private Integer weight;
    private Integer reps;
}
