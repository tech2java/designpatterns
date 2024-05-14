package com.tech2java.solid.priciples.singleresponsibility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * multiple reasons to have change this class - Violating SRP.
 *
 * Identify the responsibilities of this class-
 *
 * validation and storing obj should not be here.
 *
 *
 *
 */
public class UserController {

    //Store store=new Store();

    UserPersistenceService persistenceService=new UserPersistenceService();


    public String createUser(String jsonUser) throws JsonProcessingException {

        //Still doing parsing of incoming string - up to you
        ObjectMapper mapper=new ObjectMapper();
        User user=mapper.readValue(jsonUser,User.class);

        //Moved all validation logic to this class.
        UserValidator userValidator=new UserValidator();
        boolean valid=userValidator.validateUser(user);

        if(!valid) {
           return "ERROR";
        }

        //if the request changes this class has to be modified - Violating SRP again.
        //move this code to separate layer
        //store.saveUser(user);
        persistenceService.saveUser(user);
        return "SUCCESS";
    }

    /*

    //Validates the user object
    //if we add any extra field on User class - Then here we need to change the logic.so, violating SRP
    //move this code separate class
    private boolean isValidUser(User user) {
        if(!isPresent(user.getName())) {
            return false;
        }
        user.setName(user.getName().trim());

        if(!isValidAlphaNumeric(user.getName())) {
            return false;
        }
        if(user.getEmail() == null || user.getEmail().trim().length() == 0) {
            return false;
        }
        user.setEmail(user.getEmail().trim());
        if(!isValidEmail(user.getEmail())) {
            return false;
        }
        return true;
    }

    //Simply checks if value is null or empty..
    private boolean isPresent(String value) {
        return value != null && value.trim().length() > 0;
    }
    //check string for special characters
    private boolean isValidAlphaNumeric(String value) {
        Pattern pattern = Pattern.compile("[^A-Za-z0-9]");
        Matcher matcher = pattern.matcher(value);
        return !matcher.find();
    }
    //check string for valid email address
    private boolean isValidEmail(String value) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(value);
        return matcher.find();
    }
*/
}
