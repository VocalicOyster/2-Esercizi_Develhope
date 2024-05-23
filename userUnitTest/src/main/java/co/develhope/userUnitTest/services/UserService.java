package co.develhope.userUnitTest.services;


import co.develhope.userUnitTest.DTOs.UserDTO;
import co.develhope.userUnitTest.entities.UserEntity;
import co.develhope.userUnitTest.repositories.UserRepo;
import org.apache.catalina.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    public UserDTO createUser(UserDTO userDTO) {
        UserEntity userEntity = modelMapper.map(userDTO, UserEntity.class);
        UserEntity saved = userRepo.saveAndFlush(userEntity);
        modelMapper.map(saved, userDTO);
        return userDTO;
    }

    public List<UserEntity> getAllUser() {
        return userRepo.findAll();
    }

    public UserEntity getUserById(Long id) {
        Optional<UserEntity> user = userRepo.findById(id);
        return user.get();
    }

    public UserEntity upateName(Long id, String name) {
        Optional<UserEntity> userEntity = userRepo.findById(id);
        if(userEntity.isPresent()) {
            UserEntity user = userEntity.get();
            UserDTO userDTO = modelMapper.map(user, UserDTO.class);
            userDTO.setName(name);
            user = modelMapper.map(userDTO, UserEntity.class);
            return userRepo.saveAndFlush(user);
        }
        return null;
    }

    public UserEntity deleteById(Long id) {
        Optional<UserEntity> userEntity = userRepo.findById(id);
        if(userEntity.isPresent()) {
            UserEntity userToDelete = userEntity.get();
            userRepo.deleteById(id);
            return userToDelete;
        }
        return null;
    }


}
