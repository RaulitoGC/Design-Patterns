package creational.builder;

public class BankA {


    public void showLoginScreen(LoginBuilder builder) {

        LoginBankLibrary loginBankLibrary = builder.setColor("red")
                .setLogo("logo")
                .setTitle(" Super Bank A")
                .setSubtitle(" Lima")
                .setFullName("Super Bank A" + "Lima")
                .build();

        loginBankLibrary.makeLogin();
    }

}
