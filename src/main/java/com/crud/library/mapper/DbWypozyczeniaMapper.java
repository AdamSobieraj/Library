package com.crud.library.mapper;

import com.crud.library.domain.EntityWypozyczenia;
import com.crud.library.domain.com.crud.library.domain.Dto.WypozyczeniaDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DbWypozyczeniaMapper {

    public EntityWypozyczenia mapToEntityWypozyczenia(final WypozyczeniaDto wypozyczeniaDto){
        return new EntityWypozyczenia(
                wypozyczeniaDto.getIdWypozyczenie(),
                wypozyczeniaDto.getDataWypozyczenia(),
                wypozyczeniaDto.getIdRacownikWypozyczenie(),
                wypozyczeniaDto.getDataOddania(),
                wypozyczeniaDto.getIdPracownikOddanie()
        );
    }

    public WypozyczeniaDto mapToWyporzyczeniaDto(final EntityWypozyczenia entityWypozyczenia){
        return new WypozyczeniaDto(
                entityWypozyczenia.getIdwypozyczenie(),
                entityWypozyczenia.getIdksiazka(),
                entityWypozyczenia.getDataWypozyczenia(),
                entityWypozyczenia.getIdPracownikWypozyczenie(),
                entityWypozyczenia.getDataOddania(),
                entityWypozyczenia.getIdPracownikOddanie()
        );
    }

    public List<WypozyczeniaDto> mapToWyporzyczeniaDtoList(final List<EntityWypozyczenia> entityWypozyczeniaList){
        return entityWypozyczeniaList.stream()
                .map(t -> new WypozyczeniaDto(
                        t.getIdwypozyczenie(),
                        t.getIdksiazka(),
                        t.getDataWypozyczenia(),
                        t.getIdPracownikWypozyczenie(),
                        t.getDataOddania(),
                        t.getIdPracownikOddanie()
                ))
                .collect(Collectors.toList());
    }
}
