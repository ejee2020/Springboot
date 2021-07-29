package health.weightlifting.Service;

import health.weightlifting.dto.ExerciseDTO;
import health.weightlifting.dto.MemberDTO;
import health.weightlifting.dto.WeightDTO;
import health.weightlifting.entity.Member;
import health.weightlifting.entity.MemberImage;
import health.weightlifting.entity.Weight;
import health.weightlifting.repository.MemberImageRepository;
import health.weightlifting.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Log4j2
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;
    private final MemberImageRepository imageRepository;
    @Override
    @Transactional
    public Long register(MemberDTO memberDTO){
        Map<String, Object> entityMap = dtoToEntity(memberDTO);
        Member member = (Member) entityMap.get("member");
        List<MemberImage> memberImageList = (List<MemberImage>) entityMap.get("imgList");
        memberRepository.save(member);
        memberImageList.forEach(memberImage -> {
            imageRepository.save(memberImage);
        });
        return member.getMno();
    }

    @Override
    public MemberDTO getMember(Long mno){

        return null;
    }


}
