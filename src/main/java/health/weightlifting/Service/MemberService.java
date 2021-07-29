package health.weightlifting.Service;

import health.weightlifting.dto.MemberDTO;
import health.weightlifting.dto.MemberImageDTO;
import health.weightlifting.dto.WeightDTO;
import health.weightlifting.entity.Exercise;
import health.weightlifting.entity.Member;
import health.weightlifting.entity.MemberImage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface MemberService {
    Long register(MemberDTO memberDTO);
    MemberDTO getMember(Long mno);
    default Map<String, Object> dtoToEntity(MemberDTO memberDTO) {
        Map<String, Object> entityMap = new HashMap<>();
        Member member = Member.builder()
                .mno(memberDTO.getMno())
                .email(memberDTO.getEmail())
                .pw(memberDTO.getPw())
                .nickname(memberDTO.getNickname())
                .weight(memberDTO.getWeight())
                .height(memberDTO.getHeight())
                .build();
        entityMap.put("member", member);
        List<MemberImageDTO> imageDTOList = memberDTO.getImageDTOList();
        if (imageDTOList != null && imageDTOList.size() > 0){
            List<MemberImage> memberImageList = imageDTOList.stream().map(memberImageDTO -> {
                MemberImage memberImage = MemberImage.builder()
                        .ino(memberImageDTO.getIno())
                        .uuid(memberImageDTO.getUuid())
                        .imgName(memberImageDTO.getImgName())
                        .path(memberImageDTO.getPath())
                        .build();
                return memberImage;
            }).collect(Collectors.toList());
            entityMap.put("imgList", memberImageList);
        }
        return entityMap;
        }
}
