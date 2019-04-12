package creational.builder;

public class BankB {

    public void showLoginScreen(LoginBuilder builder) {

        LoginBankLibrary loginBankLibrary = builder.setColor("blue")
                .setLogo("logo")
                .setTitle(" Super Bank B")
                .setSubtitle(" Ica")
                .setFullName("Super Bank B" + "Ica")
                .build();

        loginBankLibrary.makeLogin();
    }
}
