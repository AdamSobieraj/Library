package com.crud.library.mapper;

import com.crud.library.domain.EntityCzytelnicy;
import com.crud.library.domain.com.crud.library.domain.Dto.CzytelnicyDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DbCzytelnicyMapper {

    public EntityCzytelnicy mapToCzytelniczy(final CzytelnicyDto czytelnicyDto){
        return new EntityCzytelnicy(
                czytelnicyDto.getIdCzytelnik(),
                czytelnicyDto.getLogin(),
                czytelnicyDto.getHaslo(),
                czytelnicyDto.getEmail(),
                czytelnicyDto.getTelefon(),
                czytelnicyDto.getDataUrodzenia()
        );
    }

    public CzytelnicyDto mapToCzytelnicyDto(final EntityCzytelnicy entityCzytelnicy){
        return new CzytelnicyDto(
                entityCzytelnicy.getIdczytelnik(),
                entityCzytelnicy.getLogin(),
                entityCzytelnicy.getHaslo(),
                entityCzytelnicy.getEmail(),
                entityCzytelnicy.getTelefon(),
                entityCzytelnicy.getData_urodzenia()
        );
    }

    public List<CzytelnicyDto> mapToCzytelnicyDto(final List<EntityCzytelnicy> entityCzytelnicyListe){
        return entityCzytelnicyListe.stream()
                .map(t -> new CzytelnicyDto(
                        t.getIdczytelnik(),
                        t.getLogin(),
                        t.getHaslo(),
                        t.getEmail(),
                        t.getTelefon(),
                        t.getData_urodzenia()
                        ))
                .collect(Collectors.toList());
    }
}
