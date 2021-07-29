package health.weightlifting.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberImageDTO {
    private Long ino;
    private String uuid;
    private String imgName;
    private String path;
}
