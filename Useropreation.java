# BUS_Project_CipherSchools

package BusProject;

import java.util.ArrayList;
import java.util.List;

public class UserOperation {

    List<User> userList = new ArrayList<>();
    public  void addUser(User user){
                    userList.add(user);
    }

    public boolean verifyEmail(String email){
             for(User user :userList){
                 if(email.equals(user.getContact().getEmail())){
 return  true;
                 }
             }
 return  false;
    }
}
