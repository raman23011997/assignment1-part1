/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Shanty
 */
public class Person {
    /* created instance variables*/
    private String FirstName,LastName,StreetAddress,city,province,postalCode;
     private LocalDate Birthdate;
     /*A constructo thatt accept first name, last name, street address, city, province, postal code, and birthdate as an arguements*/
    public Person(String firstname,String lastname,String streetaddress,String  city,String province, String postalcode, LocalDate birthdate){
        FirstName=firstname;/* validate all the inputs*/
        LastName=lastname;
        StreetAddress=streetaddress;
        this.city=city;
        this.province=province;
        setPostalCode(postalcode);/*method forwared for validation*/
        
    }/* method validates that postal code is equal to 6 otherwise throw an exception*/
    public void setPostalCode(String postalcode){
        if(postalcode.length()==6){
        postalcode=postalCode;}
        else{
        throw new IllegalArgumentException("Postal code should have 6 characters ");}
    }
/*GET METHOD FOR ALL INSTANCE VARIABLES*/

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }
   

    

    public String getCity() {
        return city;
    }

    public String getStreetAddress() {
        return StreetAddress;
    }

   

    public String getProvince() {
        return province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public LocalDate getBirthdate() {
        return Birthdate;
    }

    
    /* will return the age of the person*/
    public int getAge(LocalDate dob){
        LocalDate time=LocalDate.now();
        int age=Period.between(dob, time).getYears();
        return age;
    }/*this method return the full address of the person*/
    public String getFullAddress(){
        return StreetAddress+" ,"+ city+ " ,"+ province+" ,"+ postalCode;
    }
    }

