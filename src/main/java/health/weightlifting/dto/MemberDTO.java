package health.weightlifting.dto;


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
public class MemberDTO {
    private Long mno;
    private String email;
    private String pw;
    private String nickname;
    private Integer weight;
    private Integer height;
    @Builder.Default
    private List<MemberImageDTO> imageDTOList = new ArrayList<>();

}
