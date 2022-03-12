/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermreviewcodeforpartc;

/**
 *
 * @author aliab
 */
public class PasswordValidator {
    public PasswordValidator(){
        
    }
    
    public boolean validate(String p){
        boolean validPassword=false;
        int specialCharCount=0;
        //iterate over each character to see if it is a special character
        for(int i=0;i<p.length(); i++)
        {
            if(!(Character.isLetterOrDigit(p.charAt(i))))
            {
                //now we know there is at least one special character
                specialCharCount++;
            }
        }
        if(specialCharCount>0 &&p.length()>7)
        {
            validPassword=true;
        }
        return validPassword;
    }
}
