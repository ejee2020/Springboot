package health.weightlifting.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseDTO {
    private Long eno;
    private String name;
    private String bodyPart;
    private String description;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
