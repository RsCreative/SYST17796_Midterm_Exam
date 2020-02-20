/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author rajvindersandhu
 */

// This validator validates the user name entered is not empty (null). (10
// marks)

public class UserNameValidator extends User {

    public void nameCheck() {
        String givenName = getName();

        if (givenName.equalsIgnoreCase(null)) {
            System.out.println("User Name cannot be empty");
            setName(givenName);
        }

    }

}
