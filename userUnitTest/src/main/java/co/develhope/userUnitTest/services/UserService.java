package co.develhope.userUnitTest.services;


import co.develhope.userUnitTest.exceptions.UserException;
import co.develhope.userUnitTest.utilities.validator.UserValidator;
import models.DTOs.UserDTO;
import co.develhope.userUnitTest.entities.UserEntity;
import co.develhope.userUnitTest.repositories.UserRepo;
import models.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserValidator userValidator;

    public UserDTO createUser(UserDTO userDTO) throws UserException {
        if(userValidator.userValidator(userDTO)) {
            UserEntity userEntity = modelMapper.map(userDTO, UserEntity.class);
            UserEntity saved = userRepo.saveAndFlush(userEntity);
            modelMapper.map(saved, userDTO);
            return userDTO;
        }
        else  {
            throw new UserException("Something went wrong with data", 400);
        }
    }

    public List<UserEntity> getAllUser() {
        return userRepo.findAll();
    }

    public UserEntity getUserById(Long id) throws UserException {
        Optional<UserEntity> user =  userRepo.findById(id);
        if(user.isPresent()) {
            return user.get();
        }
        else throw new UserException("ID not present", 400);

    }

    public UserEntity upateName(Long id, String name) throws UserException {
        Optional<UserEntity> userEntity = userRepo.findById(id);
        if(userEntity.isPresent()) {
            UserEntity user = userEntity.get();
            UserDTO userDTO = modelMapper.map(user, UserDTO.class);
            userDTO.setName(name);
            user = modelMapper.map(userDTO, UserEntity.class);
            return userRepo.saveAndFlush(user);
        }
       else throw new UserException("ID not found", 400);
    }

    public UserEntity deleteById(Long id) throws UserException {
        Optional<UserEntity> userEntity = userRepo.findById(id);
        if(userEntity.isPresent()) {
            UserEntity userToDelete = userEntity.get();
            userRepo.deleteById(id);
            return userToDelete;
        }
        throw new UserException("ID not found", 400);
    }


}
