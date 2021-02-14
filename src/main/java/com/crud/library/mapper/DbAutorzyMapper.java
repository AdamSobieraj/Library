package com.crud.library.mapper;

import com.crud.library.domain.EntityAutorzy;
import com.crud.library.domain.com.crud.library.domain.Dto.AutrzyDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DbAutorzyMapper {

    public EntityAutorzy mapToAutorzy(final AutrzyDto autrzyDto){
        return new EntityAutorzy(
                autrzyDto.getIdAutora(),
                autrzyDto.getImie(),
                autrzyDto.getNazwisko()
        );
    }

    public AutrzyDto mapToEntityAutorzy(final EntityAutorzy entityAutorzy){
        return new AutrzyDto(
          entityAutorzy.getIdautora(),
          entityAutorzy.getImie(),
          entityAutorzy.getNazwisko()
        );
    }

    public List<AutrzyDto> mapToAutorzyDtoList(final List<EntityAutorzy> entityAutorziesList){
        return entityAutorziesList.stream()
                .map( t -> new AutrzyDto(
                        t.getIdautora(),
                        t.getImie(),
                        t.getNazwisko()
                        ))
                .collect(Collectors.toList());
    }
}
