package health.weightlifting.Service;


import health.weightlifting.dto.ExerciseDTO;
import health.weightlifting.dto.InfoDTO;
import health.weightlifting.entity.Exercise;
import health.weightlifting.entity.Info;
import health.weightlifting.repository.InfoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
@RequiredArgsConstructor
@Service
@Log4j2
public class InfoServiceImpl implements InfoService{
    private final InfoRepository infoRepository;
    @Override
    @Transactional
    public Long register(InfoDTO infoDTO) {
        Info info = dtoToEntity(infoDTO);
        infoRepository.save(info);
        return info.getIno();
    }

    @Override
    public InfoDTO getInfo(Long ino){
        return null;
    }
}
