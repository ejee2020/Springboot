package health.weightlifting.Service;

import health.weightlifting.dto.*;
import health.weightlifting.entity.Info;
import health.weightlifting.entity.Question;

public interface InfoService {
    Long register(InfoDTO infoDTO);
    InfoDTO getInfo(Long ino);
    default Info dtoToEntity(InfoDTO infoDTO){
        Info info = Info.builder()
                .ino(infoDTO.getIno())
                .title(infoDTO.getTitle())
                .content(infoDTO.getContent())
                .build();
        return info;
    }
    default InfoDTO entityToDTO(Info info){
        InfoDTO infoDTO = InfoDTO.builder()
                .ino(info.getIno())
                .title(info.getTitle())
                .content(info.getContent())
                .build();
        return infoDTO;
    }
}
