package creational.builder;

public class Main {

    public static void main(String[] args) {
        LoginBuilder build =  new LoginBankBuilder();

        BankA bankA = new BankA();
        bankA.showLoginScreen(build);


        BankB bankB = new BankB();
        bankB.showLoginScreen(build);

        BankC bankC = new BankC();
        bankC.showLoginScreen(build);

    }
}
