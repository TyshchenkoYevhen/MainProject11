package HomeWork10.Builder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class Account {
    public String getCustFirstName() {
        return custFirstName;
    }

    public String getCustLastName() {
        return custLastName;
    }

    public String getEmailRegistr() {
        return emailRegistr;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public String getCityName() {
        return cityName;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public String getAlias() {
        return alias;
    }

    private String custFirstName;
    private String custLastName;
    private String emailRegistr;
    private String firstName;
    private String lastNAme;
    private String companyName;
    private String address;
    private String cityName;
    private String postCode;
    private String phoneMobile;
    private String alias;

    public static class Builder {
        private Account newAccount;

        public Builder() {
            newAccount = new Account();
        }

        public Builder withCustFirstName(String custFirstName){
            newAccount.custFirstName = custFirstName;
            return this;
        }

        public Builder withCustLastName(String custLastName){
            newAccount.custLastName = custLastName;
            return this;
        }

        public Builder withEmailRegistr(String emailRegistr){
            newAccount.emailRegistr = emailRegistr;
            return this;
        }

        public Builder withFirstName(String firstName){
            newAccount.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName){
            newAccount.lastNAme = lastName;
            return this;
        }

        public Builder withCompanyName(String companyName){
            newAccount.companyName = companyName;
            return this;
        }

        public Builder withAddress(String address){
            newAccount.address = address;
            return this;
        }

        public Builder withCityName (String cityName){
            newAccount.cityName = cityName;
            return this;
        }

        public Builder withPostCode(String postCode){
            newAccount.postCode = postCode;
            return this;
        }
        public Builder withPhoneMobile(String phoneMobile){
            newAccount.phoneMobile = phoneMobile;
            return this;
        }
        public Builder withAlias(String alias){
            newAccount.alias = alias;
            return this;
        }

        public Account build(){
            return newAccount;
        }
    }
}
