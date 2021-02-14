package com.crud.library.mapper;

import com.crud.library.domain.EntityKsiazki;
import com.crud.library.domain.com.crud.library.domain.Dto.KsiazkiDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DbKsiazkiMapper {

    public EntityKsiazki mapToEntityKsiazki(final KsiazkiDto ksiazkiDto){
        return new EntityKsiazki(
                ksiazkiDto.getIdKsiazka(),
                ksiazkiDto.getIsbn(),
                ksiazkiDto.getIdKategoria(),
                ksiazkiDto.getTytul(),
                ksiazkiDto.getOpis(),
                ksiazkiDto.getIdAutr(),
                ksiazkiDto.getRokWydania(),
                ksiazkiDto.getEanCode()
        );
    }

    public KsiazkiDto mapToKiazkiDto(final EntityKsiazki entityKsiazki){
        return new KsiazkiDto(
                entityKsiazki.getIdksiazka(),
                entityKsiazki.getIsbn(),
                entityKsiazki.getIdKategoria(),
                entityKsiazki.getTytul(),
                entityKsiazki.getOpis(),
                entityKsiazki.getId_autr(),
                entityKsiazki.getRok_wydania(),
                entityKsiazki.getEanCode()
        );
    }

    public List<KsiazkiDto> mapToListKsiazkiDto(final List<EntityKsiazki> entityKsiazkiList){
        return entityKsiazkiList.stream()
                .map(t -> new KsiazkiDto(
                        t.getIdksiazka(),
                        t.getIsbn(),
                        t.getIdKategoria(),
                        t.getTytul(),
                        t.getOpis(),
                        t.getId_autr(),
                        t.getRok_wydania(),
                        t.getEanCode()
                ))
                .collect(Collectors.toList());
    }
}
