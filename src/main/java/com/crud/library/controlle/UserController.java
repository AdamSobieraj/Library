package com.crud.library.controlle;

import com.crud.library.domain.com.crud.library.domain.Dto.UsersDto;
import com.crud.library.mapper.UserMapper;
import com.crud.library.service.DbService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("v1/users")
public class UserController {

    private final DbService dbService;

    private final UserMapper userMapper;

    public UserController(DbService dbService, UserMapper userMapper) {
        this.dbService = dbService;
        this.userMapper = userMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "getUsers" )
    public List<UsersDto> getUsers(){
        return userMapper.mapToUserDtoList(dbService.getAllUsers());
    }

    @RequestMapping(method = RequestMethod.GET, value = "getUser")
    public UsersDto getUser(@RequestParam Long id) throws TaskNotFoundException{
        return userMapper.maptoUserDto(dbService.getUserById(id));
    }


    @RequestMapping(method = RequestMethod.POST, value = "addUser", consumes = APPLICATION_JSON_VALUE)
    public void addUser(@RequestBody UsersDto usersDto) {
        userMapper.maptoUserDto(dbService.saveUser(userMapper.maptoUser(usersDto)));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateUser")
    public void updateUser(@RequestBody UsersDto userDto) {
        userMapper.maptoUserDto(dbService.saveUser(userMapper.maptoUser(userDto)));
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteUser")
    public void deleteUser(@RequestParam Long userId) {
        dbService.deleteUser(userId);
    }

}
