package com.crud.library.mapper;

import com.crud.library.domain.EntityPracownicy;
import com.crud.library.domain.com.crud.library.domain.Dto.PracownicyDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DbPracownicyMapper {

    public EntityPracownicy mapToEntityPracownicy(final PracownicyDto pracownicyDto){
        return new EntityPracownicy(
                pracownicyDto.getIdPracownik(),
                pracownicyDto.getLogin(),
                pracownicyDto.getHaslo()
        );
    }

    public PracownicyDto mapToPracownicyDto(final EntityPracownicy entityPracownicy){
        return new PracownicyDto(
                entityPracownicy.getIdpracownik(),
                entityPracownicy.getLogin(),
                entityPracownicy.getHaslo()
        );
    }

    public List<PracownicyDto> mapToPracownicyDtoList(final List<EntityPracownicy> entityPracownicyList){
        return entityPracownicyList.stream()
                .map(t -> new PracownicyDto(
                        t.getIdpracownik(),
                        t.getLogin(),
                        t.getHaslo()
                ))
                .collect(Collectors.toList());
    }
}
