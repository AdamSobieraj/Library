package com.crud.library.mapper;

import com.crud.library.domain.EntityWydawnictwa;
import com.crud.library.domain.com.crud.library.domain.Dto.WydawnictwaDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DbWydawnictwaMapper {

    public EntityWydawnictwa mapToEntityWydawnictwa(final WydawnictwaDto wydawnictwaDto){
        return new EntityWydawnictwa(
                wydawnictwaDto.getIdWydawnictwo(),
                wydawnictwaDto.getNazwa()
        );
    }

    public WydawnictwaDto mapToWydawnictwaDto(final EntityWydawnictwa entityWydawnictwa){
        return new WydawnictwaDto(
                entityWydawnictwa.getIdWydawnictwo(),
                entityWydawnictwa.getNazwa()
        );
    }

    public List<WydawnictwaDto> mapToWydawnictwaDtoList(final List<EntityWydawnictwa> entityWydawnictwaList){
        return entityWydawnictwaList.stream()
                .map(t -> new WydawnictwaDto(
                        t.getIdWydawnictwo(),
                        t.getNazwa()
                ))
                .collect(Collectors.toList());
    }
}
