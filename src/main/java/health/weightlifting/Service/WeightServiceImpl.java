package health.weightlifting.Service;

import health.weightlifting.dto.WeightDTO;
import health.weightlifting.entity.Member;
import health.weightlifting.entity.Weight;
import health.weightlifting.repository.WeightRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class WeightServiceImpl implements WeightService{
    private final WeightRepository weightRepository;
    @Override
    @Transactional
    public Long register(WeightDTO weightDTO){
        Weight weight = dtoToEntity(weightDTO);
        weightRepository.save(weight);
        return weight.getWno();
    }

    @Override
    public WeightDTO getWeight(Long wno){
        return null;
    }

    @Override
    public List<WeightDTO> getListOfWeight(Long mno) {
        Member member = Member.builder().mno(mno).build();
        List<Weight> result = weightRepository.findByMember(member);
        return result.stream().map(weight -> entityToDTO(weight)).collect(Collectors.toList());
    }
}
