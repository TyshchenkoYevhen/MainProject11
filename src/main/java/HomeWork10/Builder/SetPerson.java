package HomeWork10.Builder;

public class SetPerson {
     Account myAccount = new Account.Builder()
             .withCustFirstName("John")
             .withCustLastName("Terry")
             .withEmailRegistr("tyshchenko.yevhen57@gmail.com")
             .withFirstName("Yevhen")
             .withLastName("tyshchenko")
             .withCompanyName("CT")
             .withAddress("address")
             .withCityName("Kiew")
             .withPostCode("07400")
             .withPhoneMobile("80670000000")
             .withAlias("alias")
             .build();
}
