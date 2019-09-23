/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasource;

/**
 *
 * @author nafees
 */
public class UserDataSource {
    String name="";
    
    String password="";
    
    String Email="";
    
    String Mobile_Num="";
    
    String Gender="";
    
    String image="";

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMobile_Num() {
        return Mobile_Num;
    }

    public void setMobile_Num(String Mobile_Num) {
        this.Mobile_Num = Mobile_Num;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
}
