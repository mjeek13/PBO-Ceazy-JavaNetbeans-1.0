/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceazy;

/**
 *
 * @author M- Jeek
 */
public class ceazyAdminData {
    private String username, password, hint;

    public ceazyAdminData(String username, String password, String hint) {
        this.username = username;
        this.password = password;
        this.hint = hint;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getHint() {
        return hint;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
