package co.develhope.userUnitTest.utilities.validator;

import models.DTOs.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserValidator {


    public boolean userValidator(UserDTO userDTO) {
        return isUserNotNull(userDTO) && isNameValid(userDTO) && isSurameValid(userDTO);
    }

    private boolean isUserNotNull(UserDTO userDTO) {
        return userDTO.getName() != null &&
               userDTO.getSurname() != null;
    }

    private boolean isNameValid(UserDTO userDTO) {
        return userDTO.getName().length() > 3;
    }

    private boolean isSurameValid(UserDTO userDTO) {
        return userDTO.getSurname().length() > 3;
    }

}
