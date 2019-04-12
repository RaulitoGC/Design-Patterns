package creational.builder;

public class BankC {


    public void showLoginScreen(LoginBuilder builder) {

        LoginBankLibrary loginBankLibrary = builder.setColor("green")
                .setLogo("logo")
                .setTitle(" Super Bank C")
                .setSubtitle(" Huancayo")
                .setFullName("Super Bank C" + "Huancayo")
                .build();

        loginBankLibrary.makeLogin();
    }
}
