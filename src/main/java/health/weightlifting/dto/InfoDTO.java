package health.weightlifting.dto;
import health.weightlifting.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InfoDTO {
    private Member member;
    private String title;
    private String content;
    private Long ino;
}
