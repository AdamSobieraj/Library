package com.crud.library.mapper;

import com.crud.library.domain.Users;
import com.crud.library.domain.com.crud.library.domain.Dto.UsersDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {

    public Users maptoUser(final UsersDto userDto) {
        return new Users(
                userDto.getId(),
                userDto.getName(),
                userDto.getSurname(),
                userDto.getAccountStartDate()==null? LocalDate.now(): userDto.getAccountStartDate());
    }

    public UsersDto maptoUserDto(final Users users) {
        return new UsersDto(
                users.getId(),
                users.getName(),
                users.getSurname(),
                users.getAccountStartDate());
    }

    public List<UsersDto> mapToUserDtoList(final List<Users> userList) {
        return userList.stream()
                .map(t -> new UsersDto(t.getId(), t.getName(), t.getSurname(), t.getAccountStartDate()))
                .collect(Collectors.toList());
    }
}
