package com.crud.library.mapper;

import com.crud.library.domain.EntityRole;
import com.crud.library.domain.com.crud.library.domain.Dto.RoleDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class DbRoleMapper {

    public EntityRole mapToEntityRole(final RoleDto roleDto){
        return new EntityRole(
                roleDto.getIdRola(),
                roleDto.getNazwa()
        );
    }

    public RoleDto mapToRoleDto(final EntityRole entityRole){
        return new RoleDto(
                entityRole.getIdrola(),
                entityRole.getNazwa()
        );
    }

    public List<RoleDto> mapToRoleDtoList(final List<EntityRole> entityRoleList){
        return entityRoleList.stream()
                .map(t -> new RoleDto(
                        t.getIdrola(),
                        t.getNazwa()
                ))
                .collect(Collectors.toList());
    }
}
