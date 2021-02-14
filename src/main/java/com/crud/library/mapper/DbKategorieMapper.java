package com.crud.library.mapper;

import com.crud.library.domain.EntityKategorie;
import com.crud.library.domain.com.crud.library.domain.Dto.KategorieDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DbKategorieMapper {

    public EntityKategorie mapToEntityKategortie(final KategorieDto kategorieDto){
        return new EntityKategorie(
                kategorieDto.getIdKategoria(),
                kategorieDto.getNazwa()
        );
    }

    public KategorieDto mapToKategoritDto(final EntityKategorie entityKategorie){
        return new KategorieDto(
                entityKategorie.getIdkategoria(),
                entityKategorie.getNazwa()
        );
    }

    public List<KategorieDto> mapToKategorieDto(List<EntityKategorie> entityKategorieList){
        return entityKategorieList.stream()
                .map(t-> new KategorieDto(
                        t.getIdkategoria(),
                        t.getNazwa()
                ))
                .collect(Collectors.toList());
    }
}
